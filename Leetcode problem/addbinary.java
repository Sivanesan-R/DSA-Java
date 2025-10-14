// https://leetcode.com/problems/add-binary/
import java.util.*;
public class Addbinary {
    public static void main(String [] args){
        String str1 = "11";
        String str2 = "1";
        System.out.println(addbi(str1,str2));
    }
    static String addbi(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int carry = 0,result = 0,n = 1;
        while(num1 > 0 || num2 > 0|| carry > 0){
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int sum = digit1 + digit2 + carry;
            carry = sum/2;
            result = (sum % 2) * n;
            n *= 10;
            num1 /= 10;
            num2 /= 10;
        }
        return result+"";
    }
}
