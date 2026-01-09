import java.util.*;

class Solution {
    int maxLength(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        prefix[0] = arr[0];
        int maxLen = 0;

        if (prefix[0] == 0) {
            maxLen = 1;
        }

        map.put(prefix[0], 0);

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

            if (prefix[i] == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(prefix[i])) {
                maxLen = Math.max(maxLen, i - map.get(prefix[i]));
            } else {
                map.put(prefix[i], i);
            }
        }

        return maxLen;
    }
}
