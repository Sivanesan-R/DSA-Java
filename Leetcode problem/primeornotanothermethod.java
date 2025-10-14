public class primeornotanothermethod {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    static int countPrimes(int n) {
        int count =0;
        boolean flag = true;
        for(int i=2;i<=n;i++){
            if(i != 2||i != 3||i!=5||i!=7){
                if(i% 2 == 0|| i%3 == 0||i%5==0||i%7==0){
                    flag = false;
                }
            }
            else{
                flag = true;
                count++;
            }
        }
        return count;
    }
}
