import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;

        BigInteger A = BigInteger.valueOf(34);
        BigInteger B = BigInteger.valueOf(3);
        BigInteger c = new BigInteger("1238625555464464");
        BigInteger x = new BigInteger("23");
        int z = B.intValue();
        BigInteger d = BigInteger.ZERO;
        BigInteger s = c.add(x);
        BigInteger r = c.multiply(x);
        BigInteger e = c.subtract(x);
        BigInteger div = c.divide(x);
        BigInteger rem = c.remainder(x);
        BigInteger anss = c.divide(rem);

        System.out.println(anss);
        if (c.compareTo(A) > 0) {
            System.out.println("dff");
        }
        if (c.compareTo(A) < 0) {
            System.out.println("uyu");
        }
    }
}
