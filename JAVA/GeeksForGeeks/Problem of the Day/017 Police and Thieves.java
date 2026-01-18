import java.util.*;

class Solution {
    public int catchThieves(char[] arr, int k) {
        int n = arr.length;

        ArrayList<Integer> police = new ArrayList<>();
        ArrayList<Integer> thief = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P') police.add(i);
            else if (arr[i] == 'T') thief.add(i);
        }

        int i = 0, j = 0;
        int count = 0;

        while (i < police.size() && j < thief.size()) {
            int p = police.get(i);
            int t = thief.get(j);

            if (Math.abs(p - t) <= k) {
                count++;
                i++;
                j++;
            } else if (t < p) {
                j++;
            } else {
                i++;
            }
        }

        return count;
    }
}
