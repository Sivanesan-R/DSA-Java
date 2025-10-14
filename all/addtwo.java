public class addtwo {
    public static void main(String [] args){

        String num1 = "56565656";
        String num2 = "23232323";
        int n = num1.length()-1;
        int m = num2.length()-1;

        int sum =0,l = 0,d =0,f = 0;
        for(int i =0;i>=n;i++){
            //d = num1.charAt(n) - '0';
            //f = num2.charAt(m) - '0';
            char c = num1.charAt(i);
            System.out.println(c+ " ");

        }
        System.out.println(d);
        System.out.println(f);
        sum = d + f;
        System.out.println(sum);
    }
}
