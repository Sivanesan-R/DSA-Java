public class findunique{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,1,2,3,4};
        System.out.println(uni(arr));
    }
    static int uni(int [] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}