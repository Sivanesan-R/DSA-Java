package OOPs.package_two;

public class interfac {
    public static void main(String[] args) {
        lion mufasa = new lion();
        mufasa.sound();
        System.out.println(mufasa.count);
    }
}

interface animal{
    int count = 34;
    void sound();
}

class lion implements animal{
    public void sound(){
        System.out.println("Meooww");
    }
}