public class volumefind {
    public static void main(String[] args) {
        box metalbox = new box(12,13,14);
        box woodenbox = new box(45,56,67);
        box greenbox = new box(67,35,12);
        
        
    }

}

class box{
    int length,breath,height;

    box(int len,int bre,int hei){
        this.length = len;
        this.breath = bre;
        this.height = hei;

    }
}
