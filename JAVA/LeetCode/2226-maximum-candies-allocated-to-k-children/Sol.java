class Solution {
public:

    bool toCheck(vector<int>& candies, long long mid, long long k){
        long long ct = 0;
        for(int i : candies){
            ct += i / mid;
        }
        if(ct >= k) return true;
        return false; 
    }

    int maximumCandies(vector<int>& candies, long long k) {
        long long low = 1, high = 0;
        for(int i : candies) high += i;
        long long mid = low + (high - low)/2;
        long long ans = 0;
        while(low <= high){
            if(toCheck(candies, mid, k)){
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
            mid = low + (high - low)/2;
        }
        return ans;
    }
};
