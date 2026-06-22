class Solution {
    public int numberOfSpecialChars(String word) {
        
        int[] lower = new int[26];
        int[] upper = new int[26];
        int[] ans = new int[26];

   
        for(int i = 0; i < word.length(); i++){
            char val = word.charAt(i);
            int ch = (int) val;
            if(ch >= 97 && ch <= 122){
                lower[ch - 97]++;
                if(upper[ch-97] >0){
                    ans[ch - 97] = -1;
                }
            }
            else{
                upper[ ch - 65]++;
            }
        }
        int count = 0;
        for(int i = 0 ; i < 26; i++){
            if(lower[i] > 0 && upper[i] > 0 && ans[i] == 0){
                count++;
            }
        }
        return count;
    }
}