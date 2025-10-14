import java.util.*;
public class palindrome {
    static void without_builtin(String str){
        char arr[]= new char[str.length()];
        arr=str.toCharArray();
        char[] n = new char[str.length()];
        int count=0;
        for(int i=str.length();i>0;i--){
            n[count]=arr[i];
            count++;
            
        }

    }
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the palindrome word : ");
        String str = in.nextLine();
        char[] n = new char[a.length()];
        without_builtin(str);
        

    }
}
