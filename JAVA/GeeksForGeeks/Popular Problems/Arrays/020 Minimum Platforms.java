import java.util.Arrays;

class Solution {
    public int minPlatform(int[] arr, int[] dep) {
        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0;
        int j = 0;
        int platform = 0;
        int maxPlatform = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platform++;
                maxPlatform = Math.max(maxPlatform, platform);
                i++;
            } else {
                platform--;
                j++;
            }
        }

        return maxPlatform;
    }
}
