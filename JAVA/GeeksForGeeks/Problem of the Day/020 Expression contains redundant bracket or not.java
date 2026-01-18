class Solution {
    public static boolean checkRedundancy(String s) {
        int n = s.length();
        char[] st = new char[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                boolean hasOp = false;

                while (top >= 0 && st[top] != '(') {
                    char x = st[top];
                    top--;

                    if (x == '+' || x == '-' || x == '*' || x == '/') {
                        hasOp = true;
                    }
                }

                if (top >= 0 && st[top] == '(') top--; 

                if (!hasOp) return true;
            } else {
                st[++top] = ch;
            }
        }

        return false;
    }
}
