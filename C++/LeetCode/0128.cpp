class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
       
        if(nums.size() == 0){
            return 0;
        }
        sort(nums.begin(),nums.end());
        int count = 1, maxi = 1;
        for(int i = 0; i < nums.size() - 1; i++){
           // cout<<nums[i]<<" ";
            if(nums[i] == nums[i + 1] - 1 || nums[i] == nums[i + 1]){
                if(nums[i] == nums[i + 1] - 1){
                    count++;
                }
               
            }
            else{
                if(count > maxi){
                    maxi = count;
                }
                  count = 1;
            }
              //cout<<count<<endl;
        }
        cout<<count << " "<<maxi<<endl;
        return max(count, maxi);
    }
};