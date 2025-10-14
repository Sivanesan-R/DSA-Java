package generics.comparing;

import java.util.ArrayList;

public class lambda {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+2);
        }
        // list.forEach((item) -> System.out.println(item * 2));

        operations sum = (a,b) -> a + b;
        operations sub = (a,b) -> a - b;
        operations mul = (a,b) -> a * b;

        lambda mycalculator = new lambda();
        System.out.println(mycalculator.operate(5, 4, mul));
        System.out.println(mycalculator.operate(5, 4, sum));
        System.out.println(mycalculator.operate(5, 4, sub));

    }
    private int operate(int a,int b,operations opera){
        return opera.op(a, b);
    }
}

public interface operations {
    int op(int a,int b);
}
