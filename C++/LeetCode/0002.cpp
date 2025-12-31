class Solution {
public:
    ListNode* addTwoNumbers(ListNode* alpha, ListNode* beta) {
        ListNode* anchor = new ListNode(0);
        ListNode* cursor = anchor;
        int overflow = 0;

        while (alpha != nullptr || beta != nullptr || overflow != 0) {
            int partA = (alpha != nullptr) ? alpha->val : 0;
            int partB = (beta != nullptr) ? beta->val : 0;

            int fusion = partA + partB + overflow;
            overflow = fusion / 10;

            cursor->next = new ListNode(fusion % 10);
            cursor = cursor->next;

            if (alpha != nullptr) alpha = alpha->next;
            if (beta != nullptr) beta = beta->next;
        }

        return anchor->next;
    }
};