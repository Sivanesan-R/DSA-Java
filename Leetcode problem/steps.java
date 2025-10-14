// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int n, int i) {
        if (n == 0) {
            return i;
        }
        if (n % 2 == 0) {
            return helper(n / 2, i + 1);
        }
        return helper(n - 1, i + 1);
    }
}