class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> row;
        long long val = 1;   
        
        for(int k = 0; k <= rowIndex; k++) {
            row.push_back(val);
            val = val * (rowIndex - k) / (k + 1);
        }
        
        return row;
    }
};