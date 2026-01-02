/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        int rem;
        for(int num : arr){
            int n = num;
            int rev = 0;
            while(n != 0){
                rem = n % 10;
                n /= 10;
                rev = rev * 10 + rem;
            }
            if( rev != num) return false;
        }
        return true;
    }
}