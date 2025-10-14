import java.util.Queue;

public class QuqueMssin {
    public static void main(String[] args) throws Exception {
        circularQueue queue = new circularQueue(6);
        queue.insert(3);
        queue.insert(31);
        queue.insert(322);
        queue.insert(3333);
        queue.insert(34444);
        System.out.println(queue.remove());
        queue.display();

    }
}
