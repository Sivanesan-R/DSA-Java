public class inher {
    public static void main(String[] args) {
        dad ravi = new dad();
        son siva = new son();
        System.out.println(ravi.money); 
        System.out.println(siva.money); 

    }
}
class dad{
    int money = 1000;
}

class son extends dad{
    

}
