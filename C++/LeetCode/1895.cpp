class Solution {
public:
    int largestMagicSquare(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();

        vector<vector<int>> row(m, vector<int>(n + 1, 0));
        vector<vector<int>> col(m + 1, vector<int>(n, 0));

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i][j + 1] = row[i][j] + grid[i][j];
                col[i + 1][j] = col[i][j] + grid[i][j];
            }
        }

        auto rowSum = [&](int r, int l, int rr) {
            return row[r][rr + 1] - row[r][l];
        };

        auto colSum = [&](int c, int up, int down) {
            return col[down + 1][c] - col[up][c];
        };

        int best = 1;
        int maxK = min(m, n);

        for (int k = maxK; k >= 2; k--) {
            for (int i = 0; i + k <= m; i++) {
                for (int j = 0; j + k <= n; j++) {

                    int target = rowSum(i, j, j + k - 1);
                    bool ok = true;

                    for (int r = i; r < i + k; r++) {
                        if (rowSum(r, j, j + k - 1) != target) {
                            ok = false;
                            break;
                        }
                    }
                    if (!ok) continue;

                    for (int c = j; c < j + k; c++) {
                        if (colSum(c, i, i + k - 1) != target) {
                            ok = false;
                            break;
                        }
                    }
                    if (!ok) continue;

                    int d1 = 0, d2 = 0;
                    for (int t = 0; t < k; t++) {
                        d1 += grid[i + t][j + t];
                        d2 += grid[i + t][j + k - 1 - t];
                    }

                    if (d1 == target && d2 == target) return k;
                }
            }
        }

        return best;
    }
};
