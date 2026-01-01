class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int ans[] = new int[2];
        int even = 0, odd = 0;
        for(int var : arr){
            if(var % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
        ans[0] = odd;
        ans[1] = even;
        return ans;
    }
}