public class oddoreven {
    public static void main(String[] args) {
        System.out.println(oddnum(6));
    }
    private static boolean oddnum(int n){
        return (n & 1) == 1;
    }
}
