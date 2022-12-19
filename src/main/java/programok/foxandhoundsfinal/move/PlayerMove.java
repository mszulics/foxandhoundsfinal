package programok.foxandhoundsfinal.move;

import java.util.Scanner;

import programok.foxandhoundsfinal.map.Map;
import programok.foxandhoundsfinal.movecheck.MoveCheck;

/**
 * .
 */
public class PlayerMove {

    Map board = new Map();
    MoveCheck check = new MoveCheck();
    Scanner sc = new Scanner(System.in);
    int foxRow = board.getFoxPlace()[0];
    int foxCol = board.getFoxPlace()[1];

    boolean voltlepes;

    /**
     * .
     */
    public void playerMove(String input, Map board) {
        voltlepes = false;
        do {
            if (input.equals("bal fel") && (foxRow != 0 && foxCol != 0) &&
                    check.moveCheck(board.getBoard(), foxRow - 1, foxCol - 1)) {
                board.setFoxPlace(foxRow - 1, foxCol - 1);
                board.setBoard(foxRow - 1, foxCol - 1, 1);
                board.setBoard(foxRow, foxCol, 0);
                foxRow--;
                foxCol--;
                voltlepes = true;
            } else if (input.equals("jobb fel") && (foxRow != 0 && foxCol != 7) &&
                    check.moveCheck(board.getBoard(), foxRow - 1, foxCol + 1)) {
                board.setFoxPlace(foxRow - 1, foxCol + 1);
                board.setBoard(foxRow - 1, foxCol + 1, 1);
                board.setBoard(foxRow, foxCol, 0);
                foxRow--;
                foxCol++;
                voltlepes = true;
            } else if (input.equals("bal le") && (foxRow != 7 && foxCol != 0) &&
                    check.moveCheck(board.getBoard(), foxRow + 1, foxCol - 1)) {
                board.setFoxPlace(foxRow + 1, foxCol - 1);
                board.setBoard(foxRow + 1, foxCol - 1, 1);
                board.setBoard(foxRow, foxCol, 0);
                foxRow++;
                foxCol--;
                voltlepes = true;
            } else if (input.equals("jobb le") && (foxRow != 7 && foxCol != 7) &&
                    check.moveCheck(board.getBoard(), foxRow + 1, foxCol + 1)) {
                board.setFoxPlace(foxRow + 1, foxCol + 1);
                board.setBoard(foxRow + 1, foxCol + 1, 1);
                board.setBoard(foxRow, foxCol, 0);
                foxRow++;
                foxCol++;
                voltlepes = true;
            }else if(input.equals("kilépés")){
                break;
            }
            else {
                System.out.println("Hibás lépés! Adj meg egy szabályos lépést!");
                System.out.print("Add meg merre szeretnél lépni [jobb/bal le/fel] => ");
                input = sc.nextLine();
            }
        } while (!voltlepes);
    }
}
