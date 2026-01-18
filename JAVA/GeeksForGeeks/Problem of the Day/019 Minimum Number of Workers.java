class Solution {
    public int minMen(int arr[]) {
        int n = arr.length;
        int[] maxReach = new int[n];

        for (int i = 0; i < n; i++) maxReach[i] = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) continue;

            int l = i - arr[i];
            int r = i + arr[i];

            if (l < 0) l = 0;
            if (r >= n) r = n - 1;

            maxReach[l] = Math.max(maxReach[l], r);
        }

        int count = 0;
        int i = 0;

        while (i < n) {
            int far = -1;

            for (int j = 0; j <= i; j++) {
                far = Math.max(far, maxReach[j]);
            }

            if (far < i) return -1;

            count++;
            i = far + 1;
        }

        return count;
    }
}
