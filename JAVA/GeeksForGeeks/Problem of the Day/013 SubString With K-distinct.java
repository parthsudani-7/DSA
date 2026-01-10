class Solution {
    public int countSubstr(String s, int k) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int distinct = 0;

            for (int j = i; j < n; j++) {
                if (freq[s.charAt(j) - 'a'] == 0) {
                    distinct++;
                }
                freq[s.charAt(j) - 'a']++;

                if (distinct == k) {
                    ans++;
                }
                if (distinct > k) {
                    break;
                }
            }
        }
        return ans;
    }
}
