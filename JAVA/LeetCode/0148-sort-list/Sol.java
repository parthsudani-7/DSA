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
    static ListNode sort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode right = slow.next;
        slow.next = null;

        ListNode left = sort(head);
        right = sort(right);

        return merge(left, right);
    }

    static ListNode merge(ListNode left, ListNode right) {
        if (left == null) return right;
        if (right == null) return left;

        ListNode head;

        if (left.val <= right.val) {
            head = left;
            left = left.next;
        } else {
            head = right;
            right = right.next;
        }

        ListNode curr = head;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }

            curr = curr.next;
        }

        if (left != null) {
            curr.next = left;
        } else {
            curr.next = right;
        }

        return head;
    }
    public ListNode sortList(ListNode head) {
        return sort(head);
    }
}
