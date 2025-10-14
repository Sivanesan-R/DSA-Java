package properties.inheritance;


public class Mainclass extends box {
    public static void main(String[] args) {
        box box1 = new box(4,3,4);
        // box box2 = new box(box1);
        System.out.println(box1.getl());

        // System.out.println(box1.l+" "+box1.w+" "+box1.h);
        // System.out.println(box2.l+" "+box2.w+" "+box2.h);

        // boxweight box3 = new boxweight();
        // boxweight box4 = new boxweight(2,3,4,49);
        // System.out.println(box3.w+" "+box3.h+" "+ box3.l);
        // System.out.println(box4.weight+" "+box4.h+" "+ box4.l);

        // boxweight box5 = new boxweight(box4);
        // System.out.println(box5.weight);
        // boxweight box6 = new box(2,3,4);
        // System.out.println(box6.w);

        // boxprice pir = new boxprice(2,3,8,6,60);
        // boxprice box7 = new boxprice();

        // System.out.println(box7.weight);

        // box.greeting();
        
        mess();

    }
    
}
