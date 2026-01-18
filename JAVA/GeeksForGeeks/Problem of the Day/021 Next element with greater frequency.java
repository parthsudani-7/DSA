import java.util.*;

class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) freq.put(x, freq.getOrDefault(x, 0) + 1);

        int[] res = new int[n];
        int[] st = new int[n];
        int top = -1;

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];

            while (top >= 0 && freq.get(st[top]) <= freq.get(curr)) top--;

            res[i] = (top < 0) ? -1 : st[top];

            st[++top] = curr;
        }

        for (int x : res) ans.add(x);
        return ans;
    }
}
