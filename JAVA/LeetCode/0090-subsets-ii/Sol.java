class Solution {
    static void solve(int[] nums, List<List<Integer>> ans, List<Integer> curr, int index){
        if(index >= nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        solve(nums, ans, curr, index + 1);
        curr.remove(curr.size() - 1);
        while(index + 1 < nums.length && nums[index] == nums[index + 1]){
            index++;
        }
        solve(nums, ans, curr, index + 1);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums, ans, curr, 0);
        return ans;
    }
}
