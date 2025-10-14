package OOPs.package_two;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 0;
        try {
        int a = in.nextInt();
        int b = in.nextInt();
            c = a / b;
        } catch (Exception e) {
            System.out.println(e);
        }
        if (c != 0) {
            System.out.println("The Answer is " + c);
        }
    }
}
