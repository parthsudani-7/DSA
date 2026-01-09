import java.util.*;

class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (x > 0) {
                set.add(x);
            }
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 1;
    }
}
