import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : a) {
            set.add(x);
        }

        for (int x : b) {
            set.add(x);
        }

        ans.addAll(set);
        Collections.sort(ans);

        return ans;
    }
}
