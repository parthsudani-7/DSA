class Solution {
    public String minWindow(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();
        int minLen = Integer.MAX_VALUE;
        String ans = "";
        for(int i = 0; i < n; i++) {
            if(s1.charAt(i) != s2.charAt(0))
                continue;
            int p = i;
            int q = 0;
            while(p < n && q < m) {
                if(s1.charAt(p) == s2.charAt(q)) {
                    q++;
                }
                p++;
            }
            if(q == m) {
                int len = p - i;
                if(len < minLen) {
                    minLen = len;
                    ans = s1.substring(i, p);
                }
            }
        }
        return ans;
    }
}
