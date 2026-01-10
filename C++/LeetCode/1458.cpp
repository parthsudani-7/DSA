class Solution {
public:
    int n, m;
    vector<int> a, b;
    vector<vector<int>> dp;

    int solve(int i, int j) {
        if (i == n || j == m) return -1000000000;

        if (dp[i][j] != -1) return dp[i][j];

        int ans = -100000000;

        for (int k = j; k < m; k++) {
            int prod = a[i] * b[k];
            ans = max(ans, prod);
            ans = max(ans, prod + solve(i + 1, k + 1));
        }

        ans = max(ans, solve(i + 1, j));

        return dp[i][j] = ans;
    }

    int maxDotProduct(vector<int>& nums1, vector<int>& nums2) {
        a = nums1;
        b = nums2;
        n = a.size();
        m = b.size();

        dp.assign(n, vector<int>(m, -1));

        return solve(0, 0);
    }
};
