import java.util.*;

public class libmanagsys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the user name : ");
        String name = input.nextLine();
        System.out.println("Enter the bookname : ");
        String bookname = input.nextLine();
        System.out.println("Enter the ID card Number : ");
        int idcard = input.nextInt();
        System.out.println("Any remainder : ");
        String remaindermessage = input.nextLine();

        detail u1 = new detail(name,bookname,idcard,remaindermessage);
        System.out.println(u1.user);
    }
}

class detail {
    String user, remaindermessage, book;
    int card;

    detail(String name,String bookname,int idcard,String remaindermessage){
        this.user = name;
        this.book = bookname;
        this.card = idcard;
        this.remaindermessage = remaindermessage;
    }

}