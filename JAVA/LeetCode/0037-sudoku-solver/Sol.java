class Solution {

    static boolean isSafe(char[][] board, int i, int j, char ch){

        for(int l = 0; l < board.length; l++){
            if(board[i][l] == ch) return false;
        }
        
        for(int k = 0; k < board.length; k++){
            if(board[k][j] == ch) return false;
        }

        int k = i - i % 3;
        int l = j - j % 3;
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                if(board[k + a][l + b] == ch) return false; 
            }
        }

        return true;
    }

    static boolean isEmpty(char[][] board, int[] index){

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    index[0] = i;
                    index[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean solve(char[][] board){
        int[] index = new int[2];
        if(!isEmpty(board, index)){
            return true;
        }
        int i = index[0];
        int j = index[1];

        for(int idx = 1; idx <= board.length; idx++){
            char ch = (char)(idx + '0');
            if(isSafe(board, i, j, ch)){
                board[i][j] = ch;
                if(solve(board)){
                    return true;
                }
                board[i][j] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        
        solve(board);
        return;
    }
}
