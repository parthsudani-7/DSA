class Solution {

    Integer[][] dp;

    int helper(int index, int[] coins, int amount) {

        if (amount == 0)
            return 0;

        if (index == coins.length || amount < 0)
            return Integer.MAX_VALUE;

        if (dp[index][amount] != null)
            return dp[index][amount];

        int take = helper(index, coins, amount - coins[index]);

        if (take != Integer.MAX_VALUE)
            take++;

        int skip = helper(index + 1, coins, amount);

        return dp[index][amount] = Math.min(take, skip);
    }

    public int coinChange(int[] coins, int amount) {

        dp = new Integer[coins.length][amount + 1];

        int ans = helper(0, coins, amount);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
