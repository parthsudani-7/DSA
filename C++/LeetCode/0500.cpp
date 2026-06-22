class Solution {
public:
    vector<string> findWords(vector<string>& words) {
        
        string r1 = "qwertyuiop";
        string r2 = "asdfghjkl";
        string r3 = "zxcvbnm";
        
        vector<string> ans;
        
        for(string word : words){
            
            string w = "";
            for(char c : word){
                w += tolower(c);
            }
            
            string row;
            
            if(r1.find(w[0]) != string::npos) row = r1;
            else if(r2.find(w[0]) != string::npos) row = r2;
            else row = r3;
            
            bool ok = true;
            
            for(char c : w){
                if(row.find(c) == string::npos){
                    ok = false;
                    break;
                }
            }
            
            if(ok) ans.push_back(word);
        }
        
        return ans;
    }
};