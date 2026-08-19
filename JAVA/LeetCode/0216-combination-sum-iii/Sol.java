class Solution {
    static void solve(int[] nums, int k, int n, List<List<Integer>> ans, List<Integer> curr, int index){   
        
        if(n == 0 && curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(index > 8 || n < 0 || curr.size() > k) return;
        curr.add(nums[index]);
        solve(nums, k, n - nums[index], ans, curr, index + 1);

        curr.remove(curr.size() - 1);
        solve(nums, k, n, ans, curr, index + 1);

        

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve(nums, k, n, ans, curr, 0);
        return ans;
    }
}
