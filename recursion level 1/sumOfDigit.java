public class sumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumdigit(12));
    }
    static int sumdigit(int n){
        if(n == 0){
           return 0;  
        }
        int rem = n % 10;
        return rem + sumdigit(n/10);
    }
}
