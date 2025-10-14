import java.util.*;
class client {
    String BankHolder;
    int balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdrawal(int amount){
        if(balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance!!!");
        }
    }

    void showbalance(){
        System.out.println("Balance : $"+ balance);
    }
}

public class bank{
    public static void main(String[] args) {
        System.out.print("Bank Holder Name : ");
        Scanner clientname = new Scanner(System.in);
        String name = clientname.nextLine();

        System.out.println("Deposit Amount : ");
        Scanner depoamount = new Scanner(System.in);
        int depoamo = depoamount.nextInt();
        
        System.out.println("Withdrawel Amount : ");
        Scanner with = new Scanner(System.in);
        int withamo = with.nextInt();

        main(name, depoamo, withamo);

    }
    
    static void main(String name,int depositamount,int withdrawalamount){
        client nameob = new client();
        nameob.deposit(depositamount);
        nameob.withdrawal(withdrawalamount);
        nameob.showbalance();
    }
    
}


