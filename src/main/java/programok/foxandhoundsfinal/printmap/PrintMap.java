package programok.foxandhoundsfinal.printmap;

/**
 * .
 */
public class PrintMap {
    /**
     * .
     */
    public void printMap(int[][] board) {
        for (int[] ints : board) {
            System.out.println();
            for (int j = 0; j < board.length; j++) {
                System.out.print(ints[j] + " ");
            }
        }
        System.out.println();
    }
}
