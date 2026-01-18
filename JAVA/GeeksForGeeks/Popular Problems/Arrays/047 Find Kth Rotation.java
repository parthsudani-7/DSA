class Solution {
    public int findKRotation(int arr[]) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = (low + high) / 2;

            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }
}
