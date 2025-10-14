//https://leetcode.com/problems/divide-two-integers/
public class dividetwointeger {
    public static void main(String [] args){
        System.out.println(divide(-2147483648,-1));

    }
    
    static int divide(int dividend, int divisor) {  
        if(dividend<=Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        return dividend/divisor;
       }
    
}
