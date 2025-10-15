import java.util.*;
public class functions_methods {
    public static void main (String [] args){
        //sum();
        int ans = sum2();
        System.out.println(ans);
    }


    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num 1:");
        int a = in.nextInt();
        System.out.print("Enter the num 2:");
        int b = in.nextInt();
        int sum = a + b;
        in.close();
        return sum;
    }


    static void sum(){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the num 1:");
    int a = in.nextInt();
    System.out.print("Enter the num 2:");
    int b = in.nextInt();
    int sum = a + b;
    System.out.println("Sum of the number : "+sum);
    in.close();
    }
}
