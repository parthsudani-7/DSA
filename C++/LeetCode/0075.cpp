class Solution {
    public void sortColors(int[] nums) {
        
        int s = 0, m = 0, e = nums.length - 1;
        while(m <=e){

            if(nums[m]== 0){
                nums[s] += nums[m];
                nums[m] = nums[s] - nums[m];
                nums[s] = nums[s] - nums[m];
                s++;
                m++;
            }
            else if(nums[m] == 1){
                m++;
            }else{
                nums[m] += nums[e];
                nums[e] = nums[m] - nums[e];
                nums[m] = nums[m] - nums[e];
                m++;
                e--;
            }
        }
    }
}