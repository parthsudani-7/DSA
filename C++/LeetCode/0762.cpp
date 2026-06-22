class Solution {
public:
    bool isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            int num = i;
            int bits = 0;

            while (num > 0) {
                if (num % 2 == 1) bits++;
                num = num / 2;
            }

            if (isPrime(bits)) count++;
        }

        return count;
    }
};