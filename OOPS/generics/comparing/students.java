package generics.comparing;

public class students implements Comparable<students>{
    int rollno;
    int marks;
    public students(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public int compareTo(students o) {
        System.out.println("in compareto method");
        int diff = this.marks - o.marks;
        return diff;
    }
    @Override
    public String toString() {
        return marks + " ";
    }
}
