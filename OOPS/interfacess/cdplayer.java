package interfacess;

public class cdplayer implements media{

    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
       
    }
    
}
