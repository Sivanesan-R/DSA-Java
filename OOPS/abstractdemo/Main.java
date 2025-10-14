package abstractdemo;

public class Main extends Son{
    public static void main(String[] args) {
        Son son = new Son(5);
        son.career("Engineer");
        son.partner("Pooja", 22);
        int val = son.num;
        System.out.println(val);

    }
}
