public class intro{

    int coffee = 20;
    private int tea = 25;
    void display(){
        System.out.println(tea);
    }
    public static void main(String[] args) {
        intro serve = new intro();
        // System.out.println(serve.tea);
        
        intro ser = new intro();
        ser.tea += 5;
        // System.out.println(ser.tea);
        // System.out.println(serve.tea);
    }
}