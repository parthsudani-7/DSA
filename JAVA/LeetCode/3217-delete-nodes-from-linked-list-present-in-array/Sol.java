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
    public ListNode modifiedList(int[] nums, ListNode head) {
        boolean[] remove = new boolean[100001];
        for (int x : nums) remove[x] = true;

        ListNode dummy = new ListNode(0, head), cur = dummy;
        while (cur.next != null) {
            if (remove[cur.next.val]) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return dummy.next;
    }
}
