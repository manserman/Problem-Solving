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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start= head;
        ListNode beforeSwap= new ListNode();
        beforeSwap.next=start;
        ListNode dummyHead=beforeSwap;
        ListNode current=head;
        int count=0;
        while(current!=null){
            count ++;
            if(count==k){
                ListNode next=current.next;
                current.next=null;
                beforeSwap.next=reverseList(start);
                start=next;
                while(beforeSwap.next!=null)
                    beforeSwap=beforeSwap.next;
                beforeSwap.next=next;
                current=beforeSwap;
                count=0;
            }
            current=current.next;
        }
        return dummyHead.next;
        
    }

    public ListNode reverseList(ListNode node){
        ListNode previous=null;
        ListNode current= node;
        while(current != null ){
            ListNode next= current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}
