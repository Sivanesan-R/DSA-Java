public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    
    public customStack(int size) {
        this.data = new int [size];
    }
    public customStack() {
        this(DEFAULT_SIZE);
    } 
    
    public boolean push(int item){
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an Empty Pop!!");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an Empty Pop!!");
        }
        return data[ptr];
        
    }

    public boolean isFull() {
        return ptr ==data.length -1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
}

