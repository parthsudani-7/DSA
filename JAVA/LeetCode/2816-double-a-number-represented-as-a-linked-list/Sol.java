class Solution {
    
    int carry = 0;

    ListNode solve(ListNode curr) {
        
        if (curr == null) {
            return null;
        }

        solve(curr.next);

        int val = curr.val * 2 + carry;

        curr.val = val % 10;
        carry = val / 10;

        return curr;
    }

    public ListNode doubleIt(ListNode head) {
        
        carry = 0;

        ListNode ans = solve(head);

        if (carry != 0) {
            ListNode newHead = new ListNode(carry);
            newHead.next = ans;
            return newHead;
        }

        return ans;
    }
}
