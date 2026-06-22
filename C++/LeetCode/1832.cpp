class Solution {
    public boolean checkIfPangram(String s) {
        int arr[]  = new int[26];
        
        for(char ch : s.toCharArray()){
            
            if(ch >= 'a' && ch <= 'z'){
                arr[(int)(ch) - 'a']++;
            }
            else{
                arr[(int)(ch) - 'A']++;
            }
        }
        int i ;
        for(i = 0; i < 26; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}

