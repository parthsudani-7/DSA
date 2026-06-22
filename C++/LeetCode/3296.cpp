class Solution {
public:
    long long minNumberOfSeconds(int mountainHeight, vector<int>& workerTimes) {
        
        long long left = 0;
        long long right = 1e18;
        long long ans = right;

        while(left <= right){
            long long mid = (left + right) / 2;
            
            long long total = 0;

            for(int w : workerTimes){
                long long x = (sqrt(1 + 8.0 * mid / w) - 1) / 2;
                total += x;
                if(total >= mountainHeight) break;
            }

            if(total >= mountainHeight){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return ans;
    }
};