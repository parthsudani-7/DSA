class Solution {
public:
    int minimumPairRemoval(vector<int>& nums) {
        int operations = 0;

        while (true) {
            bool sorted = true;
            for (int i = 1; i < (int)nums.size(); i++) {
                if (nums[i] < nums[i - 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) break;

            int bestIndex = 0;
            int bestSum = nums[0] + nums[1];

            for (int i = 0; i < (int)nums.size() - 1; i++) {
                int currentSum = nums[i] + nums[i + 1];
                if (currentSum < bestSum) {
                    bestSum = currentSum;
                    bestIndex = i;
                }
            }

            nums[bestIndex] = nums[bestIndex] + nums[bestIndex + 1];
            nums.erase(nums.begin() + bestIndex + 1);

            operations++;
        }

        return operations;
    }
};