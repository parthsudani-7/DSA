class Solution {
public:
    int minimumDeleteSum(string a, string b) {
        int n = a.size();
        int m = b.size();

        int arr[1001][1001];

        arr[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            arr[i][0] = arr[i-1][0] + a[i-1];
        }

        for (int j = 1; j <= m; j++) {
            arr[0][j] = arr[0][j-1] + b[j-1];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i-1] == b[j-1]) {
                    arr[i][j] = arr[i-1][j-1];
                } else {
                    arr[i][j] = min(
                        arr[i-1][j] + a[i-1],
                        arr[i][j-1] + b[j-1]
                    );
                }
            }
        }

        return arr[n][m];
    }
};
