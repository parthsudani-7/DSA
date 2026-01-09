import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i]--;
        }

        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(arr[i] / n);
        }

        return result;
    }
}
