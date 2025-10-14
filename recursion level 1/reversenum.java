public class reversenum {
    public static void main(String[] args) {
        System.out.println(pali(1234321));
    }

    // without using while loop  alternativly use the function or method call to find the palindrome 

    static int reverse(int n,int sum){
        if(n == 0){
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse(n/10,sum);
        
    }

    static boolean pali(int n){
        return n == reverse(n,0);
    }
}
