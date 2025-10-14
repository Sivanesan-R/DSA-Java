import java.util.*;
public class prime{
    public static void main(String[] args) {
        // System.out.println(prim(12));
        rangePrime(20);
    }
    static boolean prim(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static void rangePrime(int n){
        for (int i = 2; i < n; i++) {
            if(prim(i)){
                System.out.print(i+ " ");
            }
        }  
    }
}