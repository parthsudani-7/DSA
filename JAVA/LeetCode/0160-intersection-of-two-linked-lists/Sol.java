/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode temp1 = headA, temp2 = headB;
        int s1 = 0, s2 = 0;

        while(temp1 != null){
            s1++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            s2++;
            temp2 = temp2.next;
        }
        temp1 = headA;
        temp2 = headB;
        if(s2 >= s1){
            int diff = s2 - s1;
            while(temp2 != null && diff > 0){
                diff--;
                temp2 = temp2.next;
            }
        }else{
            int diff = s1 - s2;
            while(temp1 != null && diff > 0){
                diff--;
                temp1 = temp1.next;
            }
        }

        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}
