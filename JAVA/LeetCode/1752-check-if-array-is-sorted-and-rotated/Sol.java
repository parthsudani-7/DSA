class Solution {
    public boolean check(int[] nums) {
        
        int count = 1; 
        for(int i = 0; i < nums.length - 1; i++){
            System.out.println(nums[i]);
            if(nums[i] <= nums[i + 1]){
                count++;
            }else{
                break;
            }
        }
        if(count < nums.length && count >= 1 && nums[0] < nums[nums.length - 1]){
            return false;
            
        }
        for(int i = count; i < nums.length - 1; i++){
            System.out.println(nums[i]);
            if(nums[i] > nums[i + 1]){
                return false;
            }
        }
        
        
        return true;
    }
}
