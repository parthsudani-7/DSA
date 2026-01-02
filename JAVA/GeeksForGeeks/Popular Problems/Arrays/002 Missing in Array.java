class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;

        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return (int)(expectedSum - actualSum);
    }
}
