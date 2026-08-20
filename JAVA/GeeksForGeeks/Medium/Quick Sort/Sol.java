class Solution {
    public void quickSort(int[] arr, int low, int high) {
   
        int s = low, e = high;
        if(s >= e) return;
        
        int pivotIndex = partition(arr, s, e);
        
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, e);
    }

    private int partition(int[] arr, int low, int high) {
       
        int s = low, e = high;
        int pivotElement = arr[s], count = 0;
        
        for(int i = s + 1; i <= e; i++){
            if(pivotElement >= arr[i]){
                count++;
            }
        }
        int pivotIndex = count + s;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[s];
        arr[s] = temp;
        
        int i = s, j = e;
        while(i < pivotIndex && j > pivotIndex){
            
            while(arr[i] <= pivotElement) i++;
            
            while(arr[j] > pivotElement) j--;
            
            if(i < pivotIndex && j > pivotIndex){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
        
    }
}
