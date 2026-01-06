class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.size(); i++) {
            int n = nums[i];
            int count = 0;
            int sum = 0;

            for (int d = 1; d * d <= n; d++) {
                if (n % d == 0) {
                    int d1 = d;
                    int d2 = n / d;

                    if (d1 == d2) {
                        count++;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }

                    if (count > 4) {
                        break;
                    }
                }
            }

            if (count == 4) {
                totalSum += sum;
            }
        }

        return totalSum;
    }
};
