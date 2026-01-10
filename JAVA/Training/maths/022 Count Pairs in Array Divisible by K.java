class Solution {
    public static long countKdivPairs(int arr[], int n, int k) {
        // code here
        long count = 0;

        int remainder[] = new int[k];

        for (int i = 0; i < n; i++) {
            int r1 = arr[i] % k;
            int r2 = (k - r1) % k;

            count += remainder[r2];
            remainder[r1]++;
        }

        return count;
    }
}
