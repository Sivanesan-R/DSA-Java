public class supercls {
    public static void main(String[] args) {
        dog dommy = new dog();
        // dommy.sound();
        System.out.println(dommy.a);
    }
}

class animal {
    int a = 12;
    animal(String name) {
        System.out.println("animal");
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class dog extends animal{
    dog(){
        super("Monkey");
        super.sound();
        System.out.println("Dog");
        // System.out.println(super.a);
    }
}
