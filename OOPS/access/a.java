package access;

public class a {
    protected int num;
    String name;
    int [] arr;

    public int getnum(){
        return num;
    }
    public void setnum(int num){
        this.num = num;
    }

    public a(int num,String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num]; 
    }
}
