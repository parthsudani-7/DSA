class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int final = 0;
        for(int i = 0; i < nums.size(); i++){
            int temp = nums[i], count = 0;

            while(temp > 0){
                count++;
                temp /= 10;
            }
            if(count % 2 == 0) final++;
        }
        return final;
    }
};