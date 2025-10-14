package staticexample;

public class innerclass {

    static class test {
        String name;

        public test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test a = new test("rahul");
        test b = new test("ram");

        System.out.println(b.name);

    }
}
