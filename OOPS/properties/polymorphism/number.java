package properties.polymorphism;

public class number {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    double sum(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        number num = new number();
        int val = num.sum(4, 5);
        System.out.println(val);
    }
}
