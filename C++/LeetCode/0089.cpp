class Solution {
public:
    vector<int> grayCode(int n) {
        vector<int> result;
        int total = 1 << n;

        for (int i = 0; i < total; i++) {
            int value = i ^ (i >> 1);
            result.push_back(value);
        }

        return result;
    }
};
