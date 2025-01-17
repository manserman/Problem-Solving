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
                ListNode[] reversedList= reverseList(start);
                beforeSwap.next=reversedList[0];
                start=next;
                beforeSwap=reversedList[1];
                beforeSwap.next=next;
                current=beforeSwap;
                count=0;
            }
            current=current.next;
        }
        return dummyHead.next;
        
    }

    public ListNode[] reverseList(ListNode node){
        ListNode [] tab= new ListNode[2];
        ListNode previous=null;
        ListNode current= node;
        while(current != null ){
            ListNode next= current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
       return new ListNode[] { previous, node };
    }
}
