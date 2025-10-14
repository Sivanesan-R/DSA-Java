package interfacess;

public class electrincEngine implements Engine{

    @Override
    public void start() {
        
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
       
        System.out.println("Electric Engine Stop");

    }

    @Override
    public void acc() {
        
        System.out.println("Electric Engine Accelerate");

    }
    
}
