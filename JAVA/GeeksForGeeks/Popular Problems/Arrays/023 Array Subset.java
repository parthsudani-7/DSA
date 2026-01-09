class Solution {
    public boolean isSubset(int a[], int b[]) {

        int arr1[] = new int[1000001];
        int arr2[] = new int[1000001];

        for(int i = 0; i < a.length; i++){
            arr1[a[i]]++;
        }

        for(int i = 0; i < b.length; i++){
            arr2[b[i]]++;
        }

        for(int i = 0; i <= 1000000; i++){
            if(arr2[i] > arr1[i]){
                return false;
            }
        }

        return true;
    }
}
