class Solution {
public:
    int maximumUnits(vector<vector<int>>& boxTypes, int truckSize) {
        sort(boxTypes.begin(), boxTypes.end(), [](vector<int>& a, vector<int>& b){
            return a[1] > b[1];
        });
        long long ans = 0;
        for(auto arr : boxTypes){
            if(truckSize - arr[0] >= 0){
                ans += arr[1] * arr[0];
                truckSize -= arr[0];
            }
            else{
                ans += arr[1] * min(truckSize, arr[0]);
                break;
            }
        }
        return ans;
    }
};