class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        int max = 0;
        int[] freq = new int[100001];

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
            max = Math.max(max, diff);
        }

        for (int d = max; d > 0 && k > 0; d--) {
            long count = freq[d];
            long reduce = Math.min(k, count);
            freq[d] -= reduce;
            freq[d - 1] += reduce;
            k -= reduce;
        }

        if (k > 0) {
            return 0;
        }

        long ans = 0;

        for (int d = 1; d <= max; d++) {
            ans += (long) d * d * freq[d];
        }

        return ans;
    }
}
