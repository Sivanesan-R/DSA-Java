package abstractdemo;

public class Son extends parent{
    @Override
    void career(String name){
        System.out.println("I want to became a" + name);
    }
    @Override
    void  partner(String name,int  age){
        System.out.println("I love "+ name+" She is "+age);
    }

    Son(int num){
        super(num);
    }
}
