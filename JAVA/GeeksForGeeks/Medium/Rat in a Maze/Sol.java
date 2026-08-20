class Solution {

    static boolean isSafe(int[][] maze, boolean[][] visited, int i, int j, int n) {

        if(i < 0 || j < 0 || i >= n || j >= n) {
            return false;
        }

        if(visited[i][j]) {
            return false;
        }

        if(maze[i][j] == 0) {
            return false;
        }

        return true;
    }

    static void solve(int[][] maze, boolean[][] visited,
                      int i, int j, int n,
                      ArrayList<String> ans, String curr) {

        if(i == n - 1 && j == n - 1) {
            ans.add(curr);
            return;
        }
        visited[i][j] = true;

        if(isSafe(maze, visited, i - 1, j, n)) {
            solve(maze, visited, i - 1, j, n, ans, curr + "U");
        }

        if(isSafe(maze, visited, i + 1, j, n)) {
            solve(maze, visited, i + 1, j, n, ans, curr + "D");
        }

        if(isSafe(maze, visited, i, j - 1, n)) {
            solve(maze, visited, i, j - 1, n, ans, curr + "L");
        }

        if(isSafe(maze, visited, i, j + 1, n)) {
            solve(maze, visited, i, j + 1, n, ans, curr + "R");
        }

        visited[i][j] = false;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {

        int n = maze.length;

        ArrayList<String> ans = new ArrayList<>();

        if(maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans;
        }

        boolean[][] visited = new boolean[n][n];

        solve(maze, visited, 0, 0, n, ans, "");

        Collections.sort(ans);

        return ans;
    }
}
