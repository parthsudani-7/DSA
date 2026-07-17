class Solution {

    static boolean check(int[] nums, int k, int mid){
        int temp = 1;
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++){

            if(nums[i] - prev >= mid){
                temp++;

                prev = nums[i];
                if(temp >= k){
                    return true;
                }
            }
        }
        return false;
    }
    public int maximumTastiness(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0, end = nums[nums.length - 1] - nums[0];
        int mid = start + (end - start) / 2;
        while(start <= end) {
            mid = start + (end - start) / 2;

            if(check(nums, k, mid)){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return Math.min(start, Math.min(mid, end));
    }
}
