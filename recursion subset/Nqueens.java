public class Nqueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] arr = new boolean[n][n];
        System.out.println("Total solutions: " + queens(arr, 0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "Q " : "X ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        // Check same column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // Check top-left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) return false;
        }

        // Check top-right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) return false;
        }

        return true;
    }
}
