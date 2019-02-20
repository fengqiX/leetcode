package main.leetcode;

import main.leetcode.commen_structure.ListNode;

public class Q203_RemoveLinkedListElements {
   /* public ListNode removeElements(ListNode head, int val) {
        ListNode prev=head, cur = head, nextN=null;

        if(head==null) return null;

        while(cur!=null)
        {
            nextN=cur.next;
            if(cur.val==val)
            {
                if(prev==head && cur==head  )
                {
                    head=prev.next;
                    prev=head;
                }
                 else   prev.next=cur.next;
            }
            else
            {
                prev=cur;
            }
            cur=nextN;
        }
        return head;
    }*/
}
