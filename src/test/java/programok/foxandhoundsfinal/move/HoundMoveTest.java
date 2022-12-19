package programok.foxandhoundsfinal.move;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import programok.foxandhoundsfinal.map.Map;

import static org.junit.Assert.assertNotEquals;

class HoundMoveTest {

    @Mock
    Map board = new Map();
    HoundMove lepes = new HoundMove();

    @Test
    void houndMove() {
        board.create();
        int[] oldHound1Place = board.getHound1Place();
        int[] oldHound2Place = board.getHound2Place();
        int[] oldHound3Place = board.getHound3Place();
        int[] oldHound4Place = board.getHound4Place();

        lepes.houndMove(board);

        int oldValue = board.getBoardErtek(oldHound1Place) +
                board.getBoardErtek(oldHound2Place) +
                board.getBoardErtek(oldHound3Place) +
                board.getBoardErtek(oldHound4Place);

        int newValue = board.getBoardErtek(board.getHound1Place()) +
                board.getBoardErtek(board.getHound2Place()) +
                board.getBoardErtek(board.getHound3Place()) +
                board.getBoardErtek(board.getHound4Place());
        assertNotEquals(oldValue, newValue);
    }
}