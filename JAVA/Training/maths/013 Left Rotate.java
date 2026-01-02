// User function Template for Java

class Solution {
    void leftRotate(int arr[], int n) {
        // code here
        int size = arr.length;
        n = n % size;

        for (int j = 0; j < n; j++) {
            int temp = arr[0];
            for (int i = 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            arr[size - 1] = temp;
        }
        
    }
}

