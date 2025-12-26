class Solution {
    static boolean armstrongNumber(int n) {
        int num = n;
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        num = n;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            int pow = 1;
            for (int i = 0; i < count; i++) {
                pow *= rem;
            }
            sum += pow;
            num /= 10;
        }

        return sum == n;
    }
}
