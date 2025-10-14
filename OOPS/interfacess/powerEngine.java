package interfacess;

public class powerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("PowerEngine Start");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine Stop");
        
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine Accelerate");
        
    }
    
}
