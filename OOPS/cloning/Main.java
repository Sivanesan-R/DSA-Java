package cloning;

public class Main {
 public static void main(String[] args) throws CloneNotSupportedException {
    human siva = new human(20,"siva");
    // human twin =  new human(siva);
  
    human twin = (human)siva.clone();
    System.out.println(twin.age + " " + twin.name);
 }   
}
