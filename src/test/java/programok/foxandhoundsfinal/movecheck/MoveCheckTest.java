package programok.foxandhoundsfinal.movecheck;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import programok.foxandhoundsfinal.map.Map;

import static org.junit.jupiter.api.Assertions.*;

class MoveCheckTest {

    @Mock
    MoveCheck moveCheck = new MoveCheck();
    Map board = new Map();
    @Test
    void moveCheck() {
        board.create();
        assertTrue(moveCheck.moveCheck(board.getBoard(),1,1));
        assertFalse(moveCheck.moveCheck(board.getBoard(), 0,0));
    }
}