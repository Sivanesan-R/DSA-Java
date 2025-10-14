import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        StringBuffer buffer2 = new StringBuffer("Sivanesan");

        StringBuffer buffer3 = new StringBuffer(30);

        buffer.append("heloo world");
        buffer.append(" Java");
        buffer.replace(0, 5, "HELLO");
        buffer.delete(0, 6);

        buffer.reverse();

        // buffer.insert(3, "  python ");

        // String str = buffer.toString();
        // System.out.println(buffer);
        // Random random = new Random();
        // System.out.println(random.nextInt());

        // randomstring ran = new randomstring();
        int n = 20;
        String name = randomstring.generate(n);

        System.out.println(name);

        String word = "he  llo  wor ld";
        System.out.println(word);

        System.out.println(word.replaceAll("\\s",""));

        String names = "siva bala karan ram kani";
        String [] arr = names.split(" ");
        System.out.println(Arrays.toString(arr));

 
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(7.4534543));

    } 
}
