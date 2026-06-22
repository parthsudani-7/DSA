class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        long long xr = 0;
        for(int i = 0; i < nums.size(); i++) {
            xr ^= nums[i];
        }

        long long diff = xr & (-xr);

        int a = 0, b = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] & diff) {
                a ^= nums[i];
            } else {
                b ^= nums[i];
            }
        }

        return {a, b};
    }
};