class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
    int count = 1, max = 0;
        for(int i = 0; i < arr.length - 1 ; i++){
            if(arr[i] == arr[i + 1]){
                count++;
            }else{
                if(count > max) max = count;
                count = 1;
            }
        }
        return Math.max(count, max);
    }
}
 