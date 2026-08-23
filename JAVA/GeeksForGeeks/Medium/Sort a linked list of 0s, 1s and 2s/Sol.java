/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node segregate(Node head) {

        Node zerohead = new Node(-1);
        Node zerotail = zerohead;

        Node onehead = new Node(-1);
        Node onetail = onehead;

        Node twohead = new Node(-1);
        Node twotail = twohead;

        Node temp = head;

        while (temp != null) {

            Node nodeToInsert = temp;
            temp = temp.next;

            nodeToInsert.next = null;

            if (nodeToInsert.data == 0) {
                zerotail.next = nodeToInsert;
                zerotail = nodeToInsert;
            }
            else if (nodeToInsert.data == 1) {
                onetail.next = nodeToInsert;
                onetail = nodeToInsert;
            }
            else {
                twotail.next = nodeToInsert;
                twotail = nodeToInsert;
            }
        }

        if (onehead.next != null) {
            zerotail.next = onehead.next;
        }
        else {
            zerotail.next = twohead.next;
        }

        onetail.next = twohead.next;

        return zerohead.next;
    }
}
