package OOPs.package_two;

public class lamdaexpression {
    public static void main(String[] args) {
        a obj = () -> {
            System.out.println("This is possible to create the file");
        };
        obj.display();
        b obb = () -> {System.out.println("Hiiiiiiiii");};
        obb.display();
    }
}

public interface a {
    void display();
    // void bean();
    

}
public interface b {
    void display();
    // void func();
    
}