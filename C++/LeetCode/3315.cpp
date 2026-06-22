class Solution {
public:
    vector<int> minBitwiseArray(vector<int>& nums) {
        vector<int> ans(nums.size(), -1);

        for (int i = 0; i < (int)nums.size(); i++) {
            int x = nums[i];
            if ((x & 1) == 0) {
                ans[i] = -1;
                continue;
            }

            int bit = 0;
            while (bit < 31 && ((x >> bit) & 1) == 1) bit++;

            if (bit == 0) ans[i] = -1;
            else ans[i] = x - (1 << (bit - 1));
        }

        return ans;
    }
};