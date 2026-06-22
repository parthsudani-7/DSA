class Solution {
public:
    bool isTrionic(vector<int>& nums) {
        int n = nums.size();
        if(n < 3) return false;

        int idx = 0;

        while(idx + 1 < n && nums[idx] < nums[idx + 1]) idx++;
        if(idx == 0 || idx == n - 1) return false;

        while(idx + 1 < n && nums[idx] > nums[idx + 1]) idx++;
        if(idx == n - 1) return false;

        while(idx + 1 < n && nums[idx] < nums[idx + 1]) idx++;

        return idx == n - 1;
    }
};
