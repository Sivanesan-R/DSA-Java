//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
import java.util.*;
public class evennumofdigit {
    public static void main(String [] args){
        int [] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }


    static int findNumbers(int[] nums) {
        int count = 0;
        for(int val : nums){
            if(even(val)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums){
        int numbers = digit2(nums);
        return numbers % 2 == 0;
    }

    static int digit2(int num){
        return (int)(Math.log10(num)) + 1;
    }

    static int  digit(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
