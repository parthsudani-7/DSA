class Solution {
public:
    void reverseString(vector<char>& s) {
        int x = 0;
        for(int i=s.size()-1; i>(s.size()-1)/2; i--){
            s[x] = (char)(s[x] + s[i]);
            s[i] = (char)(s[x] - s[i]);
            s[x] = (char)(s[x] - s[i]);
            x++;
        } 
    }
};

