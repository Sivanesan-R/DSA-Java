package properties.inheritance;

public class box {
    private double l;
    double w;
    double h;

    box(double l,double w,double h){
        super();
        this.l = l;
        this.w = w;
        this.h = h;

    }

    public double getl(){
        return l;
    }

    box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    box(box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    static void mess(){
        System.out.println("i am in the box class  . greeting");
    }

    public void display(){
        System.out.println("Running the box");
    }
}
