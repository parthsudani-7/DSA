class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& values) {
        vector<vector<int>> result;
        int length = values.size();
        if (length < 3) return result;

        sort(values.begin(), values.end());

        for (int index = 0; index < length - 2; index++) {
            if (index > 0 && values[index] == values[index - 1]) continue;
            if (values[index] > 0) break;

            int left = index + 1;
            int right = length - 1;

            while (left < right) {
                int currentSum = values[index] + values[left] + values[right];

                if (currentSum == 0) {
                    result.push_back({values[index], values[left], values[right]});
                    int leftValue = values[left];
                    int rightValue = values[right];

                    while (left < right && values[left] == leftValue) left++;
                    while (left < right && values[right] == rightValue) right--;
                } 
                else if (currentSum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        return result;
    }
};