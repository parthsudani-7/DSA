class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][1001];
        int ans = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j] + 500;
                dp[i][diff] = Math.max(dp[i][diff], dp[j][diff] == 0 ? 2 : dp[j][diff] + 1);
                ans = Math.max(ans, dp[i][diff]);
            }
        }

        return ans;
    }
}
