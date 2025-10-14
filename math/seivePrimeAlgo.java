public class seivePrimeAlgo {
    public static void main(String[] args) {
        int val = 10;
        boolean [] arr = new boolean [val+1];
        seive(val,arr);
    }
    static void seive(int n,boolean[] primes){
        for(int i= 2;i*i <= n;i++){
            if(!primes[i]){
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
