public class typeinher {
    public static void main(String[] args) {
        dog jimmy = new dog();
        wolf stark = new wolf();
        stark.ear();
    }
}

class animal {
    void eat(){
        System.out.println("the Animal can eat also");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("it is barks");
    }
    void ear(){
        System.out.println("sharp ears");
    }
}

class wolf extends dog{
    void howl(){
        System.out.println("Awoooo");
    }
}

class cat extends animal{
    void meow(){
        System.out.println("meowwww");
    }
}
