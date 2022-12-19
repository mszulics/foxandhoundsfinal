package programok.foxandhoundsfinal.input;

import java.util.Scanner;

/**
 *.
 */
public class GameStarter {
    Scanner sc = new Scanner(System.in);

    public String getJatekosNev() {
        return jatekosNev;
    }

    public void setJatekosNev(String jatekosNev) {
        this.jatekosNev = jatekosNev;
    }

    String jatekosNev;
    String input;


    /**
     *.
     */
    public void begin() {
        System.out.print("Add meg a neved! Név: ");
        setJatekosNev(sc.nextLine());
        System.out.println("Szia " + jatekosNev + ", írj játék-ot a játék elindításához, eredményeim-et a pontszámaidhoz!");
    }
}
