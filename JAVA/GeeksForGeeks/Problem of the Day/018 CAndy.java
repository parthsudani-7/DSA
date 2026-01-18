class Solution {
    public int minCandy(int arr[]) {
        int n = arr.length;
        int[] candy = new int[n];

        for (int i = 0; i < n; i++) candy[i] = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) sum += candy[i];

        return sum;
    }
}
