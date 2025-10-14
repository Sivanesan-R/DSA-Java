public class accm{
    public static void main(String[] args) {
        bank canara = new bank();
        // System.out.println(canara.user);
        // canara.display();
        intro jav = new intro();
        jav.display();
    }
}

class bank{
    public String user = "Siva";
    void display(){
        System.out.println(user);
    }
}
