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
class MergeSoretdLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head= new ListNode();
        ListNode p1= list1;
        ListNode p2=list2;
        ListNode current=head;
        while(p1 != null && p2 != null)
        {
          if(p1.val>p2.val){
            current.next=p2;
            p2=p2.next;
          }
          else {
          current.next= p1;
          p1=p1.next;
         
        }
        current=current.next;
       
        
    }
    current.next= p1==null ?  p2: p1;
    return head.next;
    }
    
}
