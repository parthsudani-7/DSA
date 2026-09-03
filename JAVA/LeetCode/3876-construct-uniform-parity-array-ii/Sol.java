class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = Integer.MAX_VALUE, even = Integer.MAX_VALUE;

        for (int x : nums1) {
            if ((x & 1) == 1) odd = Math.min(odd, x);
            else even = Math.min(even, x);
        }

        return odd == Integer.MAX_VALUE || even == Integer.MAX_VALUE || odd < even;
    }
}
