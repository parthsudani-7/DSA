class Solution {
    public static int firstRepeated(int[] arr) {
        int n = arr.length;

        int maxVal = 0;
        for (int x : arr) {
            if (x > maxVal) maxVal = x;
        }

        int[] freq = new int[maxVal + 1];

        for (int x : arr) {
            freq[x]++;
        }

        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] > 1) {
                return i + 1; 
            }
        }

        return -1;
    }
}
