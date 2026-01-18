// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int size = arr.length;
        int temp = arr[size - 1];
        for(int i = size - 1; i > 0 ; i--){
            arr[i] = arr[i -1];
        }
        arr[0] = temp;
    }
}