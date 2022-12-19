package programok.foxandhoundsfinal.move;

import programok.foxandhoundsfinal.map.Map;
import programok.foxandhoundsfinal.movecheck.MoveCheck;

/**
 * .
 */
public class HoundMove {

    Map map = new Map();

    /**
     * .
     */
    public void houndMove(Map board) {

        boolean houndLepes;
        int movingHoundCol;
        int movingHoundRow;

        do {
            houndLepes = true;
            int houndNumber = (int) (Math.random() * 4) + 1;
            int whereToMove = (int) (Math.random() * 2) + 1;
            if (houndNumber == 1) {
                movingHoundRow = board.getHound1Place()[0];
                movingHoundCol = board.getHound1Place()[1];
                if (whereToMove % 2 == 0 && MoveCheck.botMoveCheck(board.getBoard(), movingHoundRow - 1, movingHoundCol - 1)) {
                    board.setBoard(movingHoundRow, movingHoundCol, 0);
                    board.setBoard(movingHoundRow - 1, movingHoundCol - 1, 2);
                    board.setHound1Place(movingHoundRow - 1, movingHoundCol - 1);
                } else if (whereToMove % 2 == 1 && MoveCheck.botMoveCheck(board.getBoard(), movingHoundRow - 1, movingHoundCol + 1)) {
                    board.setBoard(movingHoundRow, movingHoundCol, 0);
                    board.setBoard(movingHoundRow - 1, movingHoundCol + 1, 2);
                    board.setHound1Place(movingHoundRow - 1, movingHoundCol + 1);
                } else {
                    houndLepes = false;
                }
            } else if (houndNumber == 2) {
                movingHoundRow = board.getHound2Place()[0];
                movingHoundCol = board.getHound2Place()[1];
                if (whereToMove % 2 == 0 && MoveCheck.botMoveCheck(board.getBoard(), movingHoundRow - 1, movingHoundCol - 1)) {
                    board.setBoard(movingHoundRow, movingHoundCol, 0);
                    board.setBoard(movingHoundRow - 1, movingHoundCol - 1, 2);
                    board.setHound2Place(movingHoundRow - 1, movingHoundCol - 1);
                } else if (whereToMove % 2 == 1 && MoveCheck.botMoveCheck(board.getBoard(), movingHoundRow - 1, movingHoundCol + 1)) {
                    board.setBoard(movingHoundRow, movingHoundCol, 0);
                    board.setBoard(movingHoundRow - 1, movingHoundCol + 1, 2);
                    board.setHound2Place(movingHoundRow - 1, movingHoundCol + 1);
                } else {
                    houndLepes = false;
                }
            } else if (houndNumber == 3) {
                movingHoundRow = board.getHound3Place()[0];
                movingHoundCol = board.getHound3Place()[1];
                if (whereToMove % 2 == 0 && MoveCheck.botMoveCheck(board.getBoard(), movingHoundRow - 1, movingHoundCol - 1)) {
                    board.setBoard(movingHoundRow, movingHoundCol, 0);
                    board.setBoard(movingHoundRow - 1, movingHoundCol - 1, 2);
                    board.setHound3Place(movingHoundRow - 1, movingHoundCol - 1);
                } else if (whereToMove % 2 == 1 && MoveCheck.botMoveCheck(board.getBoard(), movingHoundRow - 1, movingHoundCol + 1)) {
                    board.setBoard(movingHoundRow, movingHoundCol, 0);
                    board.setBoard(movingHoundRow - 1, movingHoundCol + 1, 2);
                    board.setHound3Place(movingHoundRow - 1, movingHoundCol + 1);
                } else {
                    houndLepes = false;
                }
            } else if (houndNumber == 4) {
                movingHoundRow = board.getHound4Place()[0];
                movingHoundCol = board.getHound4Place()[1];
                if (whereToMove % 2 == 0 && MoveCheck.botMoveCheck(board.getBoard(), movingHoundRow - 1, movingHoundCol - 1)) {
                    board.setBoard(movingHoundRow, movingHoundCol, 0);
                    board.setBoard(movingHoundRow - 1, movingHoundCol - 1, 2);
                    board.setHound4Place(movingHoundRow - 1, movingHoundCol - 1);
                } else if (whereToMove % 2 == 1 && MoveCheck.botMoveCheck(board.getBoard(), movingHoundRow - 1, movingHoundCol + 1)) {
                    board.setBoard(movingHoundRow, movingHoundCol, 0);
                    board.setBoard(movingHoundRow - 1, movingHoundCol + 1, 2);
                    board.setHound4Place(movingHoundRow - 1, movingHoundCol + 1);
                } else {
                    houndLepes = false;
                }
            }

        } while (!houndLepes);

    }
}
