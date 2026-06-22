class Solution {
public:
    vector<long long> sumOfThree(long long num) {

        if((num - 3) % 3 == 0){
            
            long long ans = (num - 3)/3;
            return {ans, ans + 1, ans + 2};
        }
        return {};
        
        
    }
};