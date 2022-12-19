package programok.foxandhoundsfinal.game;

import java.sql.SQLException;
import java.util.Scanner;

import programok.foxandhoundsfinal.input.GameStarter;
import programok.foxandhoundsfinal.map.Map;
import programok.foxandhoundsfinal.move.HoundMove;
import programok.foxandhoundsfinal.move.PlayerMove;
import programok.foxandhoundsfinal.player.Adb;
import programok.foxandhoundsfinal.player.Players;
import programok.foxandhoundsfinal.printmap.PrintMap;

/**
 *.
 */
public class Game {

    /**
     * Maga a játék.
     */
    public void start() throws SQLException {

        GameStarter bemenet = new GameStarter();
        PlayerMove jatekosMove = new PlayerMove();
        PrintMap printMap = new PrintMap();
        HoundMove bot = new HoundMove();
        Map map = new Map();
        Players player = new Players();
        Adb adatbazis = new Adb(player);

        Scanner sc = new Scanner(System.in);
        String input = null;

        bemenet.begin();
        adatbazis.createTableIfNotExists();
        input = sc.nextLine();
        player.setName(bemenet.getJatekosNev());
        if (input.equals("játék")) {
            map.create();
            printMap.printMap(map.getBoard());
            do {
                System.out.print("Add meg merre szeretnél lépni [jobb/bal le/fel] => ");
                input = sc.nextLine();
                if(!input.equals("kilépés")){
                    jatekosMove.playerMove(input, map);
                    bot.houndMove(map);
                    printMap.printMap(map.getBoard());
                    if (map.getFoxPlace()[0] == 7) {
                        System.out.println("Gratulálok nyertél!");
                        adatbazis.statupdate();
                        break;
                    }
                }
            } while (!input.equals("kilépés"));

            System.out.println("Köszi a játékot!");
        } else if (input.equals("eredményeim")) {
            adatbazis.stat();
        } else {
            System.out.println("Majd legközelebb!");
        }
    }
}
