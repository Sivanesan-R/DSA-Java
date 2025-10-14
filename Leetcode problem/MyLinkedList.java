import java.util.List;

class MyLinkedList {

    public MyLinkedList() {

    }

    public int get(int index) {
        ListNode current = head;
        while (current != null) {
            index--;
            if (index == 0) {
                return current.val;
            }
            current = current.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode dummy = new ListNode(val);
        dummy.next = head;
        head = dummy;
    }

    public void addAtTail(int val) {
        ListNode newnode = new ListNode(val);
        if (head == null) {
            head = newnode;
            return;
        }

        ListNode current = new ListNode();
        while (current != null) {
            current = current.next;
        }
        current.next = newnode;
    }

        public void addAtIndex(int index, int val) {
            
            if (index > length(head)) {
                return;
            }
            if (index == 0) {
                addAtHead(val);
                return;
            }
            if (index == length(head)) {
                addAtTail(val);
                return;
            }

            ListNode newNode = new ListNode(val);
            ListNode current = head;
            
            for (int i = 0; i < index -1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

    public void deleteAtIndex(int index) {
        if (head == null || index < 0 || length(head)) {
            return;
        }
        if (index == 0) {
            return;
        }

        ListNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public int length(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    private class ListNode {
        public ListNode(){

        }
        public ListNode(int val){
            this.val = val;
        }
        
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */