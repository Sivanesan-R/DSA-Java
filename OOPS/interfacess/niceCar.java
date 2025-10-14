package interfacess;

public class niceCar  {
    private Engine engine;
    private media player = new cdplayer();

    public niceCar(){
        engine = new powerEngine();
    }

    public niceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }

    public void startMusic(){
        player.start();
    }
    public void stopmusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new electrincEngine();
    }

}
