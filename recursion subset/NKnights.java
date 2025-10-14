public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] arr = new boolean[n][n];
        knight(arr, 0, 0, 4);
    }

    static void knight(boolean[][] board, int row, int col, int knight) {
        if (row == board.length - 1 && col == board.length) {
            return;
        }

        if (knight == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (col == board.length) {
            knight(board, row+1, 0, knight);
            return;
        }
        if (issafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knight - 1);
            board[row][col] = false;
        }
        knight(board, row, col + 1, knight);
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        if (isvalid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isvalid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isvalid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isvalid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    static boolean isvalid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "O " : "X ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
