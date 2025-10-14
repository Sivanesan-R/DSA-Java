public class dlist {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void insertionLast(int val) {
        Node node = new Node(val);
        Node last = head;
        if (head == null) {
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }

    public void insert(int after, int val) {
        Node p = find(val);
        if (p == null) {
            System.out.println("doesn't Exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            p.next.prev = node;
        }
    }

    public Node find(int val) {
        Node node = head;
        while (node.next != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void delete(int val) {
        Node node = head;

        // Case 1: Delete head node(s)
        while (node != null && node.val == val) {
            head = node.next;
            if (head != null) {
                head.prev = null;
            }
            node = head;
        }

        // Case 2: Delete other matching nodes
        while (node != null) {
            if (node.val == val) {
                if (node.prev != null) {
                    node.prev.next = node.next;
                }
                if (node.next != null) {
                    node.next.prev = node.prev;
                }
            }
            node = node.next;
        }
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
    }

}

class Node {
    int val;
    Node prev, next;

    public Node() {

    }

    public Node(int val) {
        this.val = val;
    }
}