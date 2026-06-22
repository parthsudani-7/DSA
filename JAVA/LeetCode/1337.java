class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length, col = mat[0].length;
        int[] ans = new int[row];
        Integer[] idx = new Integer[row];
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        for(int i = 0; i < row; i++){
            idx[i] = i;
        }
        Arrays.sort(idx, (a,b)-> ans[a] - ans[b]);
        int[] sol = new int[k];      
        for(int i = 0; i < k; i++){
            sol[i] = idx[i];
            
        }
        return sol;
    }
}