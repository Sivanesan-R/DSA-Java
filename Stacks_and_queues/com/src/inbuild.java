import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inbuild {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(90); 
        // stack.push(46); 
        // stack.push(13); 
        // stack.push(89); 

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());


        Queue<Integer> queue = new LinkedList<>();
        queue.add(89);
        queue.add(34);
        queue.add(56);
        queue.add(12);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        // System.out.println(queue.peek());
 
        Deque <Integer> deque = new ArrayDeque<>();
        deque.add(83);
        deque.addFirst(90);
        deque.addLast(72);
        deque.removeFirst();
        System.out.println(deque.a);
    }
}
