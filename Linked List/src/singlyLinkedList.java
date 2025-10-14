public class singlyLinkedList {
    private node head;
    private node tail;
    private int size;

    public singlyLinkedList() {
        this.size = 0;
    }

    public void insertionfirst(int val) {
        node nodee = new node(val);
        nodee.next = head;
        head = nodee;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertionfirst(val);
            return;
        }
        if (index == size) {
            insertatlast(val);
            return;
        }
        node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node nodee = new node(val, temp.next);
        temp.next = nodee;

        size++;

    }

    public void insertrec(int val, int index) {
        head = insertrec(val, index, head);
    }

    private node insertrec(int val, int index, node node) {
        if (index == 0) {
            node temp = new node(val, node);
            size++;
            return temp;
        }
        node.next = insertrec(val, index - 1, node.next);
        return node;
    }

    public void insertatlast(int val) {
        if (tail == null) {
            insertatlast(val);
            return;
        }
        node nodee = new node(val);
        tail.next = nodee;
        tail = nodee;
        size += 1;
    }

    public int deletefirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deletefirst();
        }
        if (index == size - 1) {
            return deletelast();
        }

        node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public int deletelast() {
        if (size <= 1) {
            return deletefirst();
        }
        node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;

    }

    public node get(int index) {
        node nodee = head;
        for (int i = 0; i < index; i++) {
            nodee = nodee.next;
        }
        return nodee;
    }

    public node find(int value) {
        node nodee = head;
        while (nodee != null) {
            if (nodee.value == value) {
                return nodee;
            }
            nodee = nodee.next;
        }
        return null;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class node {
        private int value;
        private node next;

        private node(int value) {
            this.value = value;
            this.next = null;
        }

        private node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }
}

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getlength(headA);
        int lenB = getlength(headB);

        if (lenA > lenB) {
            while (lenA > lenB) {
                headA = headA.next;
                lenA--;
            }
        } else {
            while (lenB > lenA) {
                headB = headB.next;
                lenB--;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int getlength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}