import java.util.*;

class Solution {
    static void sol(int i, int target, int[] candidates,
                    List<List<Integer>> ans, List<Integer> temp) {

        if (i == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(temp)); 
            }
            return;
        }

        if (candidates[i] <= target) {
            temp.add(candidates[i]);
            sol(i, target - candidates[i], candidates, ans, temp);
            temp.remove(temp.size() - 1);
        }
        sol(i + 1, target, candidates, ans, temp);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        sol(0, target, candidates, ans, temp);
        return ans;
    }
}
