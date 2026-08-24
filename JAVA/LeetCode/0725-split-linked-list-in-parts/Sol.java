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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode[] ans = new ListNode[k];
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int i = size / k;
        int rem = size % k;
        int s = 0, index = 0;
        while(temp != null){
            ListNode var = temp;
            ans[index++] = var;
            int j = 1;
            if(i > 0 && rem > 0){
                s = i + 1;
                rem--;
            }
            else{
                s = i;
            }
            while(temp != null && j < s){
                j++;
                temp = temp.next;
            }
            if(temp == null){
                break;
            }
            var = temp.next;
            temp.next = null;
            temp = var;
        }
        return ans;
    }
}
