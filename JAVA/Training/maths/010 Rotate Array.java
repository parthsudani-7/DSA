class Solution {
    public void rotate(int[] arr, int n) {
        int size = arr.length;
        n = n % size;

        for (int j = 0; j < n; j++) {
            int temp = arr[size - 1];
            for (int i = size - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
    }
}
