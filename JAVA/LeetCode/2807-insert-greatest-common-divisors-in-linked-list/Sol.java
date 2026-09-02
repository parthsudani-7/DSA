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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        for (ListNode p = head; p != null && p.next != null; p = p.next.next) {
            int a = p.val, b = p.next.val;
            while (b != 0) {
                int t = a % b;
                a = b;
                b = t;
            }
            p.next = new ListNode(a, p.next);
        }
        return head;
    }
}
