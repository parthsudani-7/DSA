import java.util.ArrayList;

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length;
        if(n == 0) return list;

        list.add(arr[0]);

        for(int i = 1; i < n; i++) {
            if(arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        return list;
    }
}
