public class StackMain {
    public static void main(String[] args) throws Exception {
        customStack stack = new DynamicStack(5);
        stack.push(45);
        stack.push(6443);
        stack.push(5897);
        stack.push(6576);
        stack.push(2234);
        stack.push(2234);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
