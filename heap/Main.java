import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws Exception{
    Heap<Integer> heap = new Heap<>();

    heap.insert(12);
    heap.insert(89);
    heap.insert(23);
    heap.insert(78);
    heap.insert(34);

    ArrayList list = heap.heapSort();
    System.out.println(list);

  }
}