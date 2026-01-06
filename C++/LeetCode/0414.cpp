class Solution {
public:
    int thirdMax(vector<int>& nums) {
        sort(nums.begin(), nums.end());

        vector<int> temp;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                temp.push_back(nums[i]);
            }
        }

        int m = temp.size();

        if (m >= 3) {
            return temp[m - 3];
        } else {
            return temp[m - 1];
        }
    }
};
