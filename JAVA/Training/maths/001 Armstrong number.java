class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int num = n;
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num /= 10;
        } 
        return sum == n;
    }
}