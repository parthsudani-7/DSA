class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;

        int size = 1;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }

        ListNode tail = temp;

        k = k % size;
        if (k == 0) {
            return head;
        }

        temp = head;

        for (int i = 1; i < size - k; i++) {
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        tail.next = head;
        temp.next = null;

        return newHead;
    }
}
