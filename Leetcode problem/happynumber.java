// 
import java.util.*;
public class happynumber {
    public static void main(String[] args) {
        System.out.println(ishappy(1111111));
    }
    static boolean ishappy(int n){
        int sum = 0,num=0;
        
        while(n > 9){
            while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /=10;

        }
            n = sum;
            sum = 0;
        }
        return n == 7 || n == 1;
    }
}