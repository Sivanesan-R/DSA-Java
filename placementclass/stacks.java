public class stacks {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    int ptr = -1;

    public stacks(int size) {
        this.data = new int[size];
    }

    public stacks() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if (isFull()) {
            System.out.println("Stack is Full !!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }
    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
