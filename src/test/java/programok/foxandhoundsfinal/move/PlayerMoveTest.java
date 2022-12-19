package programok.foxandhoundsfinal.move;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import programok.foxandhoundsfinal.map.Map;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

class PlayerMoveTest {

    @Mock
    Map board = new Map();
    PlayerMove lepes = new PlayerMove();

    @Test
    void playerMove() {
        board.create();
        int[] oldPlace = board.getFoxPlace();
        lepes.playerMove("jobb le", board);
        int[] newPlace = board.getFoxPlace();
        assertEquals(board.getBoardErtek(oldPlace),0);
        assertEquals(board.getBoardErtek(newPlace), 1);
    }

}