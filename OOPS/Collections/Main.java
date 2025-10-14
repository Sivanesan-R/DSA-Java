package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(45);
        list2.add(454);
        list2.add(45324);
        list2.add(4545);

        list.add(45);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(56);
        vector.add(89);
        System.out.println(vector);

        
    }
}
