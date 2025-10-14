public class name {
    public static void main(String[] args) {
        name sol = new name();
        String s = "111";
        long result = sol.sumOfLargestPrimes(s);
        System.out.println("Sum of all primes formed: " + result);
    }

    public long sumOfLargestPrimes(String s) {
        if (s.isEmpty()) {
            return -1;
        }
        return helper("", s);
    }

    static long helper(String p, String s) {
        if (s.isEmpty()) {
            if (!p.isEmpty()) {
                int num = Integer.parseInt(p);
                if (prime(num)) {
                    return num;
                }
            }
            return 0;
        }
        char ch = s.charAt(0);
        long sum = 0;
        sum += helper(p + ch, s.substring(1));
        sum += helper(p, s.substring(1));
        return sum;
    }

    static boolean prime(int num) {
        boolean isprime = true;
        if (num <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isprime = false;
                }
            }
        }
        return isprime;
    }
}
