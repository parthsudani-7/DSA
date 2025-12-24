class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());

        int nearest = nums[0] + nums[1] + nums[2];

        for (int pivot = 0; pivot < nums.size() - 2; pivot++) {
            int leftWing = pivot + 1;
            int rightWing = nums.size() - 1;

            while (leftWing < rightWing) {
                int blend = nums[pivot] + nums[leftWing] + nums[rightWing];

                if (abs(blend - target) < abs(nearest - target)) {
                    nearest = blend;
                }
                if (blend < target) {
                    leftWing++;
                } else if (blend > target) {
                    rightWing--;
                } else {
                    return blend;
                }
            }
        }




        return nearest;
    }
};