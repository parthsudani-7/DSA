/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public Node addOne(Node head) {

        Node list = reverse(head);
        Node temp = list;

        int carry = 1;

        while (temp != null && carry == 1) {

            if (temp.data < 9) {
                temp.data++;
                carry = 0;
            } else {
                temp.data = 0;
            }

            temp = temp.next;
        }
        if (carry == 1) {
            Node newNode = new Node(1);

            Node last = list;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        return reverse(list);
    }
}
