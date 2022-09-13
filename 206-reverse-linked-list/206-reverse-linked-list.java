/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
//  */
class Solution {
    public ListNode reverseList(ListNode head) {
//         ListNode current=head;
//         ListNode previous=null;
//         ListNode next=null;
//         while(current!=null)
//         {
//             next=current.next;
//             current.next=previous;
//             previous=current;
//             current=next;
            
//         }
//     return previous;
//     }
// }
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
            
            
            
            