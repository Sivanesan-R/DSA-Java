public class factors {
    public static void main(String[] args) {
        factor2(20);
        // O(n) < O(sqrt(n)) --- so the O(aqrt(n)) is the better way of time complexity
    }

    // time : o(n)
    static void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // time o(sqrt(n))
    static void factor2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) { 
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
}