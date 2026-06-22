class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
        if (k <= 1) return 0;

        sort(nums.begin(), nums.end());

        int ans = INT_MAX;
        for (int i = 0; i + k - 1 < (int)nums.size(); i++) {
            int diff = nums[i + k - 1] - nums[i];
            if (diff < ans) ans = diff;
        }
        return ans;
    }
};
