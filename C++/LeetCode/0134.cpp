class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n = (int)gas.size();
        
        long long total = 0;
        long long cur = 0;
        int start = 0;
        
        for (int i = 0; i < n; i++) {
            long long diff = (long long)gas[i] - (long long)cost[i];
            total += diff;
            cur += diff;
            
            if (cur < 0) {
                start = i + 1;
                cur = 0;
            }
        }
        
        if (total < 0) return -1;
        return start;
    }
};
