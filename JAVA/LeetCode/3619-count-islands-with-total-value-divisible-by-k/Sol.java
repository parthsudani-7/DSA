class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    long sum = 0;
                    java.util.Queue<int[]> q = new java.util.LinkedList<>();
                    q.offer(new int[]{i, j});
                    sum += grid[i][j];
                    grid[i][j] = 0;

                    while (!q.isEmpty()) {
                        int[] cell = q.poll();

                        for (int d = 0; d < 4; d++) {
                            int x = cell[0] + dx[d];
                            int y = cell[1] + dy[d];

                            if (x >= 0 && x < m && y >= 0 && y < n
                                    && grid[x][y] > 0) {
                                sum += grid[x][y];
                                grid[x][y] = 0;
                                q.offer(new int[]{x, y});
                            }
                        }
                    }

                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
