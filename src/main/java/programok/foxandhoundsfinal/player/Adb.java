package programok.foxandhoundsfinal.player;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Adatbázis létrehozása.
 */
public class Adb {
    Players players;


    Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/valami", "sa", "password");


    private int id;

    public Adb(Players players) throws SQLException {
        this.players = players;

    }

    /**
     * Létrehozza az adatbázist ha még nem létezik.
     */
    public void createTableIfNotExists() throws SQLException {

        String command = "CREATE TABLE IF NOT EXISTS Nyertesek " +
                "(ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                "NAME VARCHAR(255))";

        Statement st = connection.createStatement();
        st.executeUpdate(command);
    }

    /**
     * Statisztika.
     */
    public void stat() throws SQLException {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT COUNT(*) AS NYERTESEK FROM Nyertesek WHERE NAME = '" + players.getName() + "'");
        while (rs.next()) {
            players.setWin(Integer.parseInt(rs.getString("NYERTESEK")));

            System.out.println(players.getName() + " győzelmei: " + players.getWin());
        }
    }

    /**
     * Frissíti az adatbázist.
     */
    public void statupdate() throws SQLException {
        String command = "INSERT INTO Nyertesek (NAME) VALUES (?) ";

        PreparedStatement st = connection.prepareStatement(command);
        st.setString(1, players.getName());
        st.executeUpdate();
        players.setWin(0);
    }
}