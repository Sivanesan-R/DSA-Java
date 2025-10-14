package properties.polymorphism;

public class objectprint {
    int num;

    public objectprint(int num){
        this.num = num;
    }

    public static void main(String[] args) {
        objectprint obj = new objectprint(4);
        System.out.println(obj.num);
    }
}
