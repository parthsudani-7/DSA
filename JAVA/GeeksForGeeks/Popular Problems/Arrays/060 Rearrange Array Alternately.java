import java.util.*;

class Solution {
    public void rearrange(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        long base = (long) arr[n - 1] + 1;
        int left = 0, right = n - 1;

        for (int i = 0; i < n; i++) {
            long val;
            if (i % 2 == 0) {
                val = arr[right] % base;
                right--;
            } else {
                val = arr[left] % base;
                left++;
            }
            arr[i] = (int) (arr[i] + val * base);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (arr[i] / base);
        }
    }
}
