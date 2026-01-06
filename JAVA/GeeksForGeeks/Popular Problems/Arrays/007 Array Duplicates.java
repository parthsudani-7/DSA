class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] > 1) {
                result.add(i);
            }
        }

        return result;
    }
}
