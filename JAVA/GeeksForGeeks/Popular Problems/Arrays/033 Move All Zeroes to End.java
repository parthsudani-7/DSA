class Solution {
    void pushZerosToEnd(int[] arr) {
        int j = 0, count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
            else{
                count++;
            }
        }
        for(int i = j; i < count + j; i++){
            arr[i] = 0;
        }
    }
}