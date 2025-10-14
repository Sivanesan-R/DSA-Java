package abstractdemo;

public abstract class parent {
    int num;
    abstract void career(String name);
    abstract void partner(String name,int age);

    parent(int num){
        this.num = num;
    }
    
    static void hello(){
        System.out.println("hey");
    }
}
