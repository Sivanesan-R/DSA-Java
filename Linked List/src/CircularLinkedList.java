public class CircularLinkedList {
    private node head;
    private node tail;


    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        node node = new node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value){
        node node  = head;
        if (node == null ) {
            return;
        }
        if (node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            node n = node.next;
            if (n.value == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    public void display(){
        node node = head;
        if (head != null) {
            do{
               System.out.print(node.value + " -> "); 
               node = node.next;
            }
            while(node != head);
            System.out.println("HEAD");
        } 
    }


    private class node{
        int value;
        node next;

        private node(int value) {
            this.value = value;
            
        }
    }
}
