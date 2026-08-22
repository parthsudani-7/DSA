class Solution {

    static ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode forward = temp.next;
            temp.next = prev;

            prev = temp;
            temp = forward;
        }

        return prev;
    }

    static ListNode midPoint(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static boolean compare(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        while (temp1 != null && temp2 != null) {

            if (temp1.val != temp2.val) {
                return false;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode mid = midPoint(head);

        ListNode head2 = reverse(mid);

        return compare(head, head2);
    }
}
