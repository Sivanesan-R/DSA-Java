import java.util.*;

public class nums {
    public static void main(String[] args) {
        printrev(5);
    }

    static void print(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    } 
    
    static void printrev(int n){
        if(n == 0){
            return;
        }
        printrev(n-1);
        System.out.print(n+" ");
    } 
}