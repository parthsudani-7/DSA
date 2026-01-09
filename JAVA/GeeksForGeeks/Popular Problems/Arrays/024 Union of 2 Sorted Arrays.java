import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        int n = a.length;
        int m = b.length;

        int[] temp = new int[n + m];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            temp[idx++] = a[i];
        }

        for (int i = 0; i < m; i++) {
            temp[idx++] = b[i];
        }

        Arrays.sort(temp);

        ArrayList<Integer> res = new ArrayList<>();

        if (temp.length > 0) {
            res.add(temp[0]);
        }

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != temp[i - 1]) {
                res.add(temp[i]);
            }
        }

        return res;
    }
}
