class Solution {
public:
    vector<int> answerQueries(vector<int>& nums, vector<int>& queries) {
        sort(nums.begin(), nums.end());
        
        int n = nums.size();
        vector<int> prefix(n);
        prefix[0] = nums[0];
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        
        vector<int> ans;
        
        for (int i = 0; i < queries.size(); i++) {
            int target = queries[i];
            int left = 0, right = n - 1;
            int best = -1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (prefix[mid] <= target) {
                    best = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            ans.push_back(best + 1);
        }
        
        return ans;
    }
};