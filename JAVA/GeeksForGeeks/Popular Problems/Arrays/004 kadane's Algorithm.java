class Solution {
    int maxSubarraySum(int[] arr) {

        int sum = 0;
        int maxSum = arr[0];

        for(int val : arr) {
            sum = sum + val;

            if(sum > maxSum) {
                maxSum = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}
