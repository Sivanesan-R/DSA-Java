package OOPs.package_two;

public class multipleinterface {
    public static void main(String[] args) {
        c apple = new c();
        apple.read();
        apple.write();
        apple.stor();
    }
}

 interface readable {
    void read();
    
}

 interface writeable {
    void write();
    
}
 interface storeable {
    void store();
    
}


class c implements readable,writeable,storeable{
    public void read(){
        System.out.println("siva");
    }
    public void write(){
        System.out.println("kello");
    }
    public void stor(){
        System.out.println("hiii");
    }
    
    
}