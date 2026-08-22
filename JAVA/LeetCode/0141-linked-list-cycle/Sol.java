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
    public boolean hasCycle(ListNode head) {
        
        int i = 10000000;
        ListNode temp = head;

        while(temp != null){
            if(temp.val == i){
                return true;
            }
            temp.val = i;
            temp = temp.next;
        }
        return false;

    }
}
