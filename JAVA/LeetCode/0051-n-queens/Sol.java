class Solution {
    static boolean isSafe(int i, int j, char[][] map) {
        for (int k = 0; k < j; k++) {
            if (map[i][k] == 'Q') {
                return false;
            }
        }

        int k = i - 1;
        int l = j - 1;

        while (k >= 0 && l >= 0) {
            if (map[k][l] == 'Q') {
                return false;
            }
            k--;
            l--;
        }

        k = i + 1;
        l = j - 1;

        while (k < map.length && l >= 0) {
            if (map[k][l] == 'Q') {
                return false;
            }
            k++;
            l--;
        }

        return true;
    }

    static void solve(int n, List<List<String>> ans, char[][] map, int j) {
        if (j >= n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(map[i]));
            }

            ans.add(temp);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(i, j, map)) {
                map[i][j] = 'Q';

                solve(n, ans, map, j + 1);

                map[i][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] map = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(map[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        solve(n, ans, map, 0);

        return ans;
    }
}
