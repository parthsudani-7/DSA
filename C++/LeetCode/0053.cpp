class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum = 0, max = -1000000000;
        int start = 0, end = 1;
        for(int i = 0; i < nums.size(); i++){
            sum += nums[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;        
        }
        return max;
    }
};