package interfacess.extendedDemo;

public class Main implements a,b {

    @Override
    public void fun() {
        System.out.println("Fun");
    }

    @Override
    public void greet() {
        System.out.println("Greeting");
    }

    public static void main(String[] args) {
        // a.method();
        Main aa = new Main();
        // aa.fun();
        
    }

}
