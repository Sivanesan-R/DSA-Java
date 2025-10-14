import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        // System.out.println(seqret("", "abc"));
        seq("", "abc");
    }
    static void seq(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);

        seq(p+ch, up.substring(1));
        seq(p, up.substring(1));
    }
    static ArrayList<String> seqret(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
         }
        char ch = up.charAt(0);

        ArrayList<String> left =seqret(p+ch, up.substring(1));
        ArrayList<String> right = seqret(p, up.substring(1));

        left.addAll(right);
        return left;
    }

}
