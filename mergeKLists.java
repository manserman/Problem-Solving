class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyHead = new ListNode();
        if (lists == null || lists.length == 0) {
            return null;
        }
        dummyHead.next = lists[0];
        for (int i = 1; i < lists.length; i++) {
            dummyHead.next= mergeTwoLists(dummyHead.next,lists[i]);
        }
        return  dummyHead.next;

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        while (l1 != null && l2 != null) {
            if(l1.val<l2.val){
                current.next= l1;
                l1=l1.next;
            }
            else {
                current.next= l2;
                l2=l2.next;

            }
            current=current.next;
        }
        if(l1 == null) {
            current.next=l2;
        }
        else {
            {
            current.next=l1;
        }
        }
        return dummyHead.next;
    }
}
