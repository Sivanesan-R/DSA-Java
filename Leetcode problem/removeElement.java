// https://leetcode.com/problems/remove-linked-list-elements/description/?envType=problem-list-v2&envId=linked-list
public class removeElement {

}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;

        while (first.next != null) {
            if (first.next.val == val) {
                first.next = first.next.next;
            } else {
                first = first.next;
            }
        }
        return dummy.next;
    }
}
