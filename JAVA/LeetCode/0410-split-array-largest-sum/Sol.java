class Solution {

    static boolean check(int[] nums, int k, int mid) {
        int splits = 1;   
        int currSum = 0;

        for (int num : nums) {
            if (currSum + num <= mid) {
                currSum += num;
            } else {
                splits++;
                currSum = num;

                if (splits > k) {
                    return false;
                }
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (check(nums, k, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
