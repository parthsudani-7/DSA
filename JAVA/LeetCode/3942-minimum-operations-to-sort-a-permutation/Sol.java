class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int[] rev = new int[n];

        int zero = 0;
        for (int i = 0; i < n; i++) {
            rev[i] = nums[n - 1 - i];
            if (nums[i] == 0) {
                zero = i;
            }
        }

        int shift0 = zero;
        int shift1 = n - 1 - zero;

        boolean valid0 = true;
        boolean valid1 = true;

        for (int i = 0; i < n; i++) {
            if (nums[(i + shift0) % n] != i) {
                valid0 = false;
            }
            if (rev[(i + shift1) % n] != i) {
                valid1 = false;
            }
        }

        int size = 2 * n;
        int[] dist = new int[size];
        java.util.Arrays.fill(dist, -1);

        int[] queue = new int[size];
        int front = 0, rear = 0;

        queue[rear++] = 0;
        dist[0] = 0;

        while (front < rear) {
            int state = queue[front++];
            int type = state / n;
            int shift = state % n;

            int next = type * n + (shift + 1) % n;
            if (dist[next] == -1) {
                dist[next] = dist[state] + 1;
                queue[rear++] = next;
            }

            next = (1 - type) * n + (n - shift) % n;
            if (dist[next] == -1) {
                dist[next] = dist[state] + 1;
                queue[rear++] = next;
            }
        }

        int ans = Integer.MAX_VALUE;

        if (valid0) {
            ans = Math.min(ans, dist[shift0]);
        }

        if (valid1) {
            ans = Math.min(ans, dist[n + shift1]);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
