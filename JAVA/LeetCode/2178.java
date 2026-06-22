class Solution {
public:
    vector<long long> maximumEvenSplit(long long nums) {
        if(nums % 2 != 0){
             // vector<long long> ans();
            return {};
        }
        vector<long long> ans;
        int i = 2, j = 0;
    
        while(nums > 0){
            if(nums >= i * 2 + 2){
                nums -= i;
                ans.push_back(i);
                i +=2;
            }else{
                ans.push_back(nums) ;
                return ans;
            }
        }
        return ans;
    }
};