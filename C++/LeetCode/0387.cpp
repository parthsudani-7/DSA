class Solution {
public:
    int firstUniqChar(string s) {
        int size = s.size();
        vector<int> frq(26,0);

        for(int i = 0; i < size; i++){
            frq[(int)(s[i] - 'a')]++;
            
        }
        for(int i = 0; i < size; i++){
           if(frq[(int)(s[i] -'a')] == 1){
                return i;
           }
        }
        return -1;
    }
};