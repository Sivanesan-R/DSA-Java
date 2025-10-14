public class clist {
    private Node head;
    private Node tail;

    public clist(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
    Node node = new Node(val);

    if (head == null) {
        head = node;
        tail = node;
        node.next = head; 
        return;
    }

    tail.next = node;
    node.next = head; 
    tail = node;
}


    public void delete(int val){
        Node node = head;
        if (node == null) {
            return;
        }
        if (head != null) {
            head = head.next;
            tail = head;
            return;
        }

        do{ 
            if (node.next.val == val) {
                node.next = node.next.next;
                break;
            }

        }while(node != head);
    }

    public void display(){
        Node node = head;
        if (head != null) {
            do{
               System.out.print(node.val + " -> "); 
               node = node.next;
            }
            while(node != head);
            System.out.println("HEAD");
        } 
    }
}

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}
