public class teacher {

    String mamname;

    void setname(String mamname){
        this.mamname = mamname;
    }
    public static void main(String[] args) {
        teacher mam = new teacher();
        mam.setname("Gayathri");
        System.out.println(mam.mamname);
    }
}
