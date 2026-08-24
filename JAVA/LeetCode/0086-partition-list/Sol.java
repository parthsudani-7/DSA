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
    public ListNode partition(ListNode head, int x) {
        
        ListNode smaller = new ListNode(-1);
        ListNode greater = new ListNode(-1);
        ListNode smallerHead = smaller;
        ListNode greaterHead = greater;
        
        ListNode temp = head;

        while(temp != null){
            ListNode var = temp.next;
            temp.next = null;
            if(temp.val < x){
                smaller.next = temp;
                smaller = smaller.next;
            }
            else{
                greater.next = temp;
                greater = greater.next;
            }
            temp = var;
        }
        smaller.next = greaterHead.next;
        return smallerHead.next;
    }
}
