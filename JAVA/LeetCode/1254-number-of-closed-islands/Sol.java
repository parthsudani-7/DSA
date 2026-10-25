class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int[] queue = new int[n * m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    int front = 0, rear = 0;
                    boolean closed = true;

                    queue[rear++] = i * m + j;
                    grid[i][j] = 1;

                    while (front < rear) {
                        int cell = queue[front++];
                        int r = cell / m;
                        int c = cell % m;

                        if (r == 0 || c == 0 ||
                            r == n - 1 || c == m - 1) {
                            closed = false;
                        }

                        for (int k = 0; k < 4; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];

                            if (nr >= 0 && nr < n &&
                                nc >= 0 && nc < m &&
                                grid[nr][nc] == 0) {

                                grid[nr][nc] = 1;
                                queue[rear++] = nr * m + nc;
                            }
                        }
                    }

                    if (closed) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
