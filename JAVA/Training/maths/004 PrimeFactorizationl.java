class Solution {
    public static void printPrimeFactorization(int n) {
        // code here
        for( int i = 2; i <= n; i++){
            while( n % i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}
