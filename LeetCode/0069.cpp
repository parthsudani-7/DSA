class Solution {
public:
    long long root(int n) {
        long long s = 0;
        long long e = n;
        long long ans = -1;

        while (s <= e) {
            long long mid = s + (e - s) / 2;
            long long square = mid * mid;

            if (square == n) {
                return mid;
            }
            if (square < n) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    int mySqrt(int x) {
        return root(x);
    }
};