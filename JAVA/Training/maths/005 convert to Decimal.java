// User function Template for Java

class Solution {
    static int decimalEquivalent(String N, int b) {
        int result = 0;

        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                value = ch - 'A' + 10;
            } else {
                return -1;
            }

            if (value >= b) {
                return -1;
            }

            result = result * b + value;
        }

        return result;
    }
}
