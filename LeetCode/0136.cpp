class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int  start = 0, end = nums.size() - 1;
        int ans = 0;
        while(start <= end){
            ans = ans ^ nums[start];
            start++;
            
        }
        return ans;
    }
};