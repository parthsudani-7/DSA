import java.util.*;

class Solution {
    int maxValue(int arr[]) {
        int mod = 1000000007;
        Arrays.sort(arr);

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + (long)arr[i] * i) % mod;
        }

        return (int)sum;
    }
}
