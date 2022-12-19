package programok.foxandhoundsfinal;

import java.sql.SQLException;

import programok.foxandhoundsfinal.game.Game;


/**
 * .
 */
public class Main {
    /**
     *.
     */
    public static void main(String[] args) throws SQLException {

        Game game = new Game();
        game.start();

    }


}