public class DoublyLinkedList {
    private node head;

    public void insertionFirst(int value) {
        node node = new node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertionLast(int value){
        node node = new node(value);
        node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

        
    }

    public void insert(int after,int value){
        node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;

        }
        node node = new node(value); 
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public node find(int value){
        node nodee  = head;
        while (nodee != null) {
            if (nodee.value == value) {
                return nodee;
            }
            nodee = nodee.next;
        }
        return null;
    }

    public void display() {
        node node = head;
        node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print Reverse ");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
   

    private class node {
        int value;
        node next;
        node prev;

        private node(int value) {
            this.value = value;
        }
    }
}
