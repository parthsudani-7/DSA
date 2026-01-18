class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {

        int n = arr.length;
        int windowXor = 0;

        for (int i = 0; i < k; i++) {
            windowXor = windowXor ^ arr[i];
        }

        int maxXor = windowXor;

        int left = 0;

        for (int right = k; right < n; right++) {

            windowXor = windowXor ^ arr[left];
            left++;

            windowXor = windowXor ^ arr[right];

            if (windowXor > maxXor) {
                maxXor = windowXor;
            }
        }

        return maxXor;
    }
}
