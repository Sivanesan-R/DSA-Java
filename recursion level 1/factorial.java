public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);  // in this point we use    fact(n--)   but it actual loop concept so in this code run infine loop 
    }                        // browse the concept.
}
