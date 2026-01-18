class Solution {
    public int count(int coins[], int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            for (int s = coin; s <= sum; s++) {
                dp[s] += dp[s - coin];
            }
        }

        return dp[sum];
    }
}
