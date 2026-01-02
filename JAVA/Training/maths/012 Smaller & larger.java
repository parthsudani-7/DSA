// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int greater = 0, smaller = 0;
        
        for(int num : arr){
            if (num >= target) greater++;
            if(num <= target) smaller++;
        }
        int ans[] = {smaller, greater};
        return ans;
    }
}