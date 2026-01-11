import java.util.Arrays;

class Solution {
    public boolean findTriplets(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            int l = i + 1;
            int r = n - 1;

            while(l < r) {
                int sum = arr[i] + arr[l] + arr[r];

                if(sum == 0) {
                    return true;
                }
                else if(sum < 0) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }

        return false;
    }
}
