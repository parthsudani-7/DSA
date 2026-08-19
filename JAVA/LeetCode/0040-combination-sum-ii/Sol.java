class Solution {
    static void solve(int[] nums, int target ,List<List<Integer>> ans, List<Integer> curr, int index){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(index >= nums.length || target < 0) return;

        curr.add(nums[index]);
        solve(nums, target - nums[index], ans, curr, index + 1);
        while(index + 1 < nums.length && nums[index] == nums[index + 1]){
            index++;
        }
        curr.remove(curr.size() - 1);
        solve(nums, target, ans, curr, index + 1);
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(nums, target, ans, curr, 0);
        return ans;
    }
}
