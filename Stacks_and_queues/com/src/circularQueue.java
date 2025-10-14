public class circularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public circularQueue(int size) {
        this.data = new int[size];
    }

    public circularQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end = (end + 1) % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("This Queue is Empty");
        }
        int removed = data[front];
        front = (front + 1) % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("This Queue is Empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;
        int count = 0;
        while (count < size) {
            System.out.print(data[i] + " -> ");
            i = (i + 1) % data.length;
            count++;
        }
        System.out.println("END");
    }
}
