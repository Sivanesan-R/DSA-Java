// https://leetcode.com/problems/zigzag-conversion/
import java.util.*;

public class convert {
    public static void main(String[] args) {
        System.out.println(converting("PAYPALISHIRING", 3)); // Expected output: "PAHNAPLSIIGYIR"
    }

    static String converting(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s; // No zigzag needed
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown; // Change direction
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
