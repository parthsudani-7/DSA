
class Solution {
    static void seq(int[] nums, int idx, List<Integer> current, List<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        seq(nums, idx + 1, current, ans);

        current.add(nums[idx]);
        seq(nums, idx + 1, current, ans);

        current.remove(current.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        seq(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}
