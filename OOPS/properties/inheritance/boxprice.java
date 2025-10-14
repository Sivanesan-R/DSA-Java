package properties.inheritance;

public class boxprice extends boxweight {
    double cost;

    boxprice(){
        super();
        this.cost = 100;
    }

    boxprice(double length,double width,double height,double weight,double cost){
        super(length,width,height,weight);
        this.cost = cost;
    }

    boxprice(boxprice other){
        super(other);
        this.cost = other.cost;
    }
}

