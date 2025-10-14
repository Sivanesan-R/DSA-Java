import java.util.*;
public class string {
    public static void main(String[] args) {
     String name = new String("Sivanesan");
     String n = new String("Sivanesan");
    
     //  == comparision operators

    // System.out.println(name == n); 
    // System.out.println(name.equals(n));
    
    // // index place 
    
    // System.out.println(name.charAt(5));
    StringBuilder biulder = new StringBuilder();
    for(int i=0;i<26;i++){
        char ch = (char)('a'+i);
        biulder.append(ch);
    }
    System.out.println(biulder.toString());
}


}
