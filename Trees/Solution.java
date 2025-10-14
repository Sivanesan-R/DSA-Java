import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        int sum = Integer.parseInt(val);
        int add = 0;
        
        while(sum > 0){
            int digit = sum % 10 ;
            add += digit;
            sum /= 10;
        }
        if (add <= 9) {
            System.out.println(add);
        }
        
    }
}
