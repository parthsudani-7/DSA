class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] res = new int[n];

        long left = 1;
        for (int i = 0; i < n; i++) {
            res[i] = (int) left;
            left = left * arr[i];
        }

        long right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = (int) (res[i] * right);
            right = right * arr[i];
        }

        return res;
    }
}
