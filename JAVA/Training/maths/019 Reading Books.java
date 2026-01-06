// User function Template for Java

class Solution {
    public int maxPoint(int k, int[] arr1, int[] arr2) {
        // code
        int max = 0,n = 0;
        for(int i = 0; i < arr1.length; i++){
            n = k / arr1[i];            
            
            max = Math.max(n * arr2[i], max);
            i++;
        }
        return max;
        
    }
}
