public class printalpha {
    public static void main(String[] args) {
        print("t6hi3ui");
    }
    //using built in function
    static void  print(String s){
        int i=s.length()-1;
        int j=0;
        char d1;
        String res="";
        int d2=0;
        StringBuilder val=new StringBuilder();
        while(j<=i){
            d1=s.charAt(j);
            if(Character.isDigit(d1)){
                d2=d1-'0';
                mul(d2,res,val);
                res="";
            }
            else{
                res=res+d1;
            }
            j++;
        }
        val.append(res);
       System.out.println(val);
    }
    static void mul(int d2, String res,StringBuilder val){
        for(int i=1;i<=d2;i++){
            val.append(res);
        }
    }
}