
public class main {
    public static void main(String[] args) {


        int [] number = new int[5];

        String [] student = new String[5];

        int[] rno = new int[5];
        String [] naems = new String[5];
        int [] marks = new int [5];

        student [] arr = new student[5];
       
        // student sivan;
        // System.out.println(Arrays.toString(students));

        student siva = new student();
        student ram = new student();
        student man = ram;
        
        ram.rno = 45;
        // System.out.println(man.rno);

        // siva.rno = 53;
        // siva.naems = "sivanesan";
        // siva.marks = 56;

        // siva.greeting();
        // ram.greeting();

        // System.out.println(siva.rno);
        // System.out.println(siva.naems);
        // System.out.println(siva.marks);

        // int a = 10;
        // int b = 5;
        Integer a = 13;
        Integer b = 15;

        swap(a,b);

        // System.out.println(a+" "+ b);

        // final a sivan = new a("Sivanessan");
        // sivan.name = "other name";
        // sivan = new a("New object");

        a obj = new a("bala");
        System.out.println(obj);

        
    }   
    
    static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    static class student{
        int rno;
        String  naems;
        float  marks;
        void greeting(){
            System.out.println("I am " +this.naems);
        }
        student(){
            this.rno = 53;
            this.naems = "sivanesan";
            this.marks = 56;
        }
    }

    static class a {
        final int num = 4;
        String name;

        public a(String name){
            this.name = name;
        }
    }
    
}
