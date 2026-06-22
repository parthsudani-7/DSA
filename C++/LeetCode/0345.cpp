class Solution {
public:
    string reverseVowels(string s) {
        
        int start = 0, end = s.size() - 1;

        while(start < end){
            if(s[start] == 'a' || s[start] == 'A' || s[start] == 'e' || s[start] == 'E' || s[start] == 'I' || s[start] == 'i' || s[start] == 'o' || s[start] == 'O' || s[start] == 'u' ||s[start] == 'U'  ){
            
                if(s[end] == 'a' || s[end] == 'A' || s[end] == 'e' || s[end] == 'E' || s[end] == 'I' || s[end] == 'i' || s[end] == 'o' || s[end] == 'O' || s[end] == 'u' ||s[end] == 'U'  ){
                    swap(s[start], s[end]);
                    
                }else{
                    start--;
                }

            }else{
                end++;
            }
            end--;
            start++;
        }
        return s;
    }
};