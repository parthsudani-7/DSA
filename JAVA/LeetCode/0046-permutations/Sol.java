class Solution {
    static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void sol(int i, int[] nums, List<List<Integer>> ans){

        if(i == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int it: nums){
                temp.add(it);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int idx = i; idx < nums.length; idx++){
            swap(idx, i, nums);
            sol(i + 1, nums, ans);
            swap(idx, i, nums);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        sol(0, nums, ans);
        return ans;


    }
}
