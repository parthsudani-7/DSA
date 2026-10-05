class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] permutation = new int[n + 1];

        int low = 0;
        int high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                permutation[i] = low++;
            } else {
                permutation[i] = high--;
            }
        }

        permutation[n] = low;

        return permutation;
    }
}
