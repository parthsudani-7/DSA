class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> s1;
        for (int x : nums1) s1.insert(x);

        unordered_set<int> ans;
        for (int x : nums2) {
            if (s1.count(x)) ans.insert(x);
        }

        vector<int> res;
        for (int x : ans) res.push_back(x);

        return res;
    }
};