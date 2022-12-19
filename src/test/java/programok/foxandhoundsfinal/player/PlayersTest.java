package programok.foxandhoundsfinal.player;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class PlayersTest {

    @Mock
    Players player = new Players();
    @Test
    void setWin() {
        player.setWin(3);
        assertEquals(player.getWin(),3);
    }

    @Test
    void setName() {
        player.setName("Valaki");
        assertEquals(player.getName(),"Valaki");
    }
}