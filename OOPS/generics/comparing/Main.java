package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

import access.objectdemo;

public class Main{
    public static void main(String[] args) {
        students siva = new students(53, 86);
        students arun = new students(2, 34);
        students prasanth = new students(23, 23);
        students john = new students(24, 67);
        students gunal = new students(22, 78);

        students[] list = {siva,arun,prasanth,john,gunal};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list,(o1,o2) -> (o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));
        

        // if (arun.compareTo(siva) < 0) {
        //     System.out.println("Siva has more mark.");
        // }
        // if (siva.compareTo(arun) < 0) {
        //     System.out.println("Arun has more marks.");
        // }
    }

}
