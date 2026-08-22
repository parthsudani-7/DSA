/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */
class Solution {
    public int getKthFromLast(Node head, int k) {

        Node temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (k <= 0 || k > size) {
            return -1;
        }

        temp = head;
        int i = 1;

        while (i < size - k + 1) {
            temp = temp.next;
            i++;
        }

        return temp.data;
    }
}
