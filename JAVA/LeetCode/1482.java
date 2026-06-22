class Solution {

    boolean possible(int[] nums, long m, long k, long mid) {
        long bouquets = 0;
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid) {
                count++;

                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquets >= m;
    }

    public int minDays(int[] nums, long m, long k) {

        long n = nums.length;

        // Overflow-safe check
        if (m > n / k) {
            return -1;
        }

        long start = Integer.MAX_VALUE;
        long end = Integer.MIN_VALUE;

        for (int x : nums) {
            start = Math.min(start, x);
            end = Math.max(end, x);
        }

        long ans = -1;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            if (possible(nums, m, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int) ans;
    }
}