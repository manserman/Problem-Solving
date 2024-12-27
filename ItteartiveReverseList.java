/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode forwardHead = head.next;
        ListNode backwardHead = head;
        backwardHead.next = null;
        while (forwardHead != null) {
            ListNode current = forwardHead.next;
            forwardHead.next = backwardHead;
            backwardHead = forwardHead;
            forwardHead = current;

        }
        return backwardHead;

    }
}
