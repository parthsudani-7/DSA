class Solution {
    public int findMin(int[] nums) {
        
        int n = nums.length;

        int s = 0, e = n - 1;
        int ans = 0;
        int mid = 0;
        while(s <= e){
            mid = s + (e - s)/2;
            if(nums[mid] <= nums[n - 1]){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }

        }
        return nums[ans];
    }
}
