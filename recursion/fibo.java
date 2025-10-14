public class fibo {
    public static void main(String[] args) {
        System.out.println(ffibo(5));
    }
    static int ffibo(int n){
        if(n < 2){
            return n;
        }
        return ffibo(n-1) + ffibo(n-2);
    }
}
