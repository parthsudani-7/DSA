class Solution {
public:
    vector<int> minBitwiseArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n, -1);

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int best = -1;

            for (int b = 0; b < 31; b++) {
                if (x & (1 << b)) {
                    int a = x ^ (1 << b);
                    if ((a | (a + 1)) == x) {
                        if (best == -1 || a < best) best = a;
                    }
                }
            }

            ans[i] = best;
        }

        return ans;
    }
};