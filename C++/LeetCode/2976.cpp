class Solution {
public:
    long long minimumCost(string source, string target,
                          vector<char>& original,
                          vector<char>& changed,
                          vector<int>& cost) {

        long long dp[26][26];
        long long INF = 1e18;

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (i == j) dp[i][j] = 0;
                else dp[i][j] = INF;
            }
        }

        for (int i = 0; i < original.size(); i++) {
            int from = original[i] - 'a';
            int to = changed[i] - 'a';
            dp[from][to] = min(dp[from][to], (long long)cost[i]);
        }

        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (dp[i][k] + dp[k][j] < dp[i][j]) {
                        dp[i][j] = dp[i][k] + dp[k][j];
                    }
                }
            }
        }

        long long res = 0;

        for (int i = 0; i < source.size(); i++) {
            int x = source[i] - 'a';
            int y = target[i] - 'a';
            if (dp[x][y] == INF) return -1;
            res += dp[x][y];
        }

        return res;
    }
};