class Solution {
public:
    int maxSideLength(vector<vector<int>>& mat, int threshold) {
        int m = mat.size();
        int n = mat[0].size();

        vector<vector<int>> pref(m + 1, vector<int>(n + 1, 0));

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pref[i][j] = mat[i - 1][j - 1]
                          + pref[i - 1][j]
                          + pref[i][j - 1]
                          - pref[i - 1][j - 1];
            }
        }

        auto getSum = [&](int r1, int c1, int r2, int c2) {
            return pref[r2][c2] - pref[r1][c2] - pref[r2][c1] + pref[r1][c1];
        };

        int low = 0, high = min(m, n), ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            bool possible = false;

            for (int i = 0; i + mid <= m; i++) {
                for (int j = 0; j + mid <= n; j++) {
                    int sum = getSum(i, j, i + mid, j + mid);
                    if (sum <= threshold) {
                        possible = true;
                        break;
                    }
                }
                if (possible) break;
            }

            if (possible) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
};