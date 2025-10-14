public class sudokusolver {
    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot Solve");
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyleft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyleft = false;
                    break;
                }
            }
            if (emptyleft == false) {
                break;
            }
        }
        if (emptyleft == true) {
            return true;
        }

        for (int num = 1; num <= 9; num++) {
            if (issafe(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean issafe(int[][] board, int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][col] == number) {
                return false;
            }
        }
        for (int[] nums : board) {
            if (nums[col] == number) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowstart = row - row % sqrt;
        int colstart = col - col % sqrt;

        for (int r = rowstart; r < rowstart + sqrt; r++) {
            for (int c = colstart; c < colstart + sqrt; c++) {
                if (board[r][c] == number) {
                    return false;
                }
            }
        }
        return true;
    }
}
