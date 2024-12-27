/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        if(head==null){
          return 0; }
        int maxSumm=Integer.MIN_VALUE;
        ListNode twinHead=findHalf(head);
        twinHead=reverseList(twinHead);
        while(twinHead!=null){
            int currentSum= twinHead.val + head.val;
            maxSumm= Math.max(maxSumm,currentSum);
            twinHead=twinHead.next;
            head=head.next;
        }

        return maxSumm;
    }
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
   public ListNode findHalf(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode previous=head; 
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            previous=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        previous.next=null;
        return slow;
        
    }
}
