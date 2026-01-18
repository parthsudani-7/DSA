class Solution {
    public int countSubarrays(int[] arr, int k) {
        int n = arr.length;
        int[] freq = new int[n + 1];

        int oddCount = 0;
        int result = 0;

        freq[0] = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }

            if (oddCount - k >= 0) {
                result += freq[oddCount - k];
            }

            freq[oddCount]++;
        }

        return result;
    }
}
