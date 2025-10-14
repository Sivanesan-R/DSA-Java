package cloning;

public class human implements Cloneable {
    int age;
    int name;

    public human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public human(human other) {
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
}
