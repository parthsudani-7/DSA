class Solution {
public:
    int numOfWays(int n) {
        long long mod = 1000000007;

        long long abc = 6;
        long long aba = 6;

        for (int row = 2; row <= n; row++) {
            long long next_abc = (2 * abc + 2 * aba) % mod;
            long long next_aba = (2 * abc + 3 * aba) % mod;

            abc = next_abc;
            aba = next_aba;
        }

        return (int)((abc + aba) % mod);
    }
};
