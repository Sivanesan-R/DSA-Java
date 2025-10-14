package properties.inheritance;

public class boxweight extends box{
    double weight;

    public boxweight(){
        this.weight = -10;

    }
    // @Override
    // static void greeting(){
    //     System.out.println("i am in the boxweight class.greeting");
    // }

    public boxweight(boxweight other){
        super(other);
        weight = other.weight;
    }

    public boxweight(double length, double width, double height,double weight) {
        super(length, width, height);
        this.weight = weight;

    }
}
