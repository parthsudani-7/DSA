class Solution {
    public int getSecondLargest(int[] arr) {

        if(arr.length < 2){
            return -1;
        }

        int first = -1;
        int second = -1;

        for(int val : arr){
            if(val > first){
                second = first;
                first = val;
            }else if(val < first && val > second){
                second = val;
            }
        }

        return second;
    }
}
