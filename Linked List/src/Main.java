public class Main {
    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        list.insertionfirst(45);
        list.insertionfirst(90);
        list.insertionfirst(26);
        list.insertionfirst(79);
        list.insertatlast(4555);
        list.insert(999999, 3);
        list.insertrec(88, 2);
        list.display();
        int interval = 45;
        list.find(interval);
        list.display();
        
        // System.out.println(list.deletefirst());
        // list.display();
        // System.out.println(list.deletelast());
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();


        // DoublyLinkedList list = new DoublyLinkedList();
        // list.insertionFirst(45);
        // list.insertionFirst(90);
        // list.insertionFirst(26);
        // list.insertionFirst(79);
        // list.insertionLast(56);
        // list.insertionLast(32);
        // list.insert(26, 0);
        // list.display();

        // CircularLinkedList list = new CircularLinkedList();
        // list.insert(1);
        // list.insert(2);
        // list.insert(3);
        // list.insert(4);
        // list.display();
        // list.delete(3);
        // list.display();
    }
}
