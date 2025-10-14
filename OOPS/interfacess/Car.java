package interfacess;

public class Car implements Engine,brake{

    @Override
    public void start() {
        System.out.println("I start like a normal  car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal  car");
        
    }
    
    @Override
    public void acc() {
        System.out.println("I accelerate like a normal  car");
        
    }

    @Override
    public void bre() {
        System.out.println("I break like a normal  car");
    }
}
