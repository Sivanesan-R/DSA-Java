import java.util.ArrayList;

public class heapmain {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(11);
        heap.insert(67);
        heap.insert(55);
        heap.insert(39);

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
    }
}
