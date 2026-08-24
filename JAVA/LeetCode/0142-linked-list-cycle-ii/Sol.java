/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null){
            fast = fast.next;
            if(fast != null){   
                fast = fast.next;
                slow = slow.next;
            }
            if(slow == fast){
                break;
            }
        }
        if(fast == null){
            return null;
        }
        slow = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
       
    }
}
