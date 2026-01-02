class Solution {
    public Node intersectPoint(Node head1, Node head2) {

        int len1 = 0, len2 = 0;
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        if (len1 > len2) {
            int diff = len1 - len2;
            while (diff-- > 0) {
                temp1 = temp1.next;
            }
        } else {
            int diff = len2 - len1;
            while (diff-- > 0) {
                temp2 = temp2.next;
            }
        }

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }
}
