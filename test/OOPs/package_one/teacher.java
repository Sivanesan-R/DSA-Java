package OOPs.package_one;

import OOPs.package_two.student;

public class teacher {
    protected int salary = 1000;

    static int population = 12;
    

    static void disp(){
        System.out.println("Hello");
    }
    static {
        System.out.println("Hey there ");
    }
    
        final void dis(){
            System.out.println("caslls a");
        }

    
    public static void main(String[] args) {
        // System.out.println("hello");
        // System.out.println(population);
        // teacher.disp();

        // teacher gayu = new teacher();
        // teacher divya = new teacher();

        // final int weekday = 7;
        // System.out.println(weekday);

        teacher gg = new teacher();
        b dd = new b();
        // gg.dis();
        dd.dis();
    }
}

class b extends teacher{
        
    }