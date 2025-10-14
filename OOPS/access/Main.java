package access;

public class Main {
    public static void main(String[] args) {
        a obj = new a(9, "siva");
        System.out.println(obj.name);

        obj.getnum();
        obj.setnum(5);
        System.out.println(obj.getClass());
    }

}
