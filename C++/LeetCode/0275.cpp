class Solution {
public:
    int hIndex(vector<int>& citations) {
        int n = citations.size();
        int low = 0, high = n - 1;
        int mid = low + (high - low) / 2;
        int ans = 0;
        while(low <= high){
            if(citations[mid] < n - mid){
                ans = max(ans, citations[mid]);
                low = mid + 1;
            }
            else{
                ans = max(ans, min(citations[mid], n - mid));
                high = mid - 1;
            }
            mid = low + (high - mid)/2;
        }
        return ans;

    }
};