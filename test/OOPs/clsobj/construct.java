public class construct {
    int marks;
    String name;

    

    construct(int a,String b){
        marks = a;
        name = b;
    }

    public static void main(String[] args) {
        construct siva = new construct(98,"Sivanesan");
        construct rahul = new construct(56, "rahul");
        System.out.println(siva.marks);
        System.out.println(rahul.marks);
        
    }
}
