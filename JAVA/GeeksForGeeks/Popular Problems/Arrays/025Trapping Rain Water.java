class Solution {
    public int maxWater(int arr[]) {

        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > leftMax[i - 1]) {
                leftMax[i] = arr[i];
            } else {
                leftMax[i] = leftMax[i - 1];
            }
        }

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > rightMax[i + 1]) {
                rightMax[i] = arr[i];
            } else {
                rightMax[i] = rightMax[i + 1];
            }
        }

        int water = 0;

        for (int i = 0; i < n; i++) {
            int minHeight;
            if (leftMax[i] < rightMax[i]) {
                minHeight = leftMax[i];
            } else {
                minHeight = rightMax[i];
            }

            if (minHeight > arr[i]) {
                water = water + (minHeight - arr[i]);
            }
        }

        return water;
    }
}
