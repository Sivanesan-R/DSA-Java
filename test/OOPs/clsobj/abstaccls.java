public class abstaccls {
    public static void main(String[] args) {
        
    }
}
abstract class vehicle{
   abstract void speed();

   void brand(){
    System.out.println("Honda");
   }
}

class bike extends vehicle{
    void speed(){
        System.out.println("35 Km/h");
    }
}

class car extends vehicle{
    void speed(){
        System.out.println("45 Km/h");
    }
}