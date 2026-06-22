#include <bits/stdc++.h>
using namespace std;

/* Structure for list node
struct ListNode {
    int val;
    ListNode* next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode* nxt) : val(x), next(nxt) {}
};
*/

class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode temp(0);
        temp.next = head;
        ListNode* ptr = &temp;

        while(ptr->next && ptr->next->next) {
            ListNode* n1 = ptr->next;
            ListNode* n2 = ptr->next->next;
            n1->next = n2->next;
            n2->next = n1;
            ptr->next = n2;
            ptr = n1;
        }
        return temp.next;
    }
};