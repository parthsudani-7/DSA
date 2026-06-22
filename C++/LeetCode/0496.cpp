#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> stk;
        unordered_map<int,int> mp;

        for(int i = nums2.size() - 1; i >= 0; i--) {
            int cur = nums2[i];

            while(!stk.empty() && stk.top() <= cur) {
                stk.pop();
            }

            if(stk.empty())
                mp[cur] = -1;
            else
                mp[cur] = stk.top();

            stk.push(cur);
        }

        vector<int> out;

        for(int x : nums1) {
            out.push_back(mp[x]);
        }

        return out;
    }
};