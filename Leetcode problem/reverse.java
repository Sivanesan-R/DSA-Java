// https://leetcode.com/problems/reverse-string/submissions/1596299328/
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        char [] arr = {'h','e','l','l','o'};
        reversestring(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reversestring(char [] s){
        start = 0;
        end = s.length;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--; 
        }
    }
}