#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    string replaceWords(vector<string>& dictionary, string sentence) {
        unordered_set<string> st(dictionary.begin(), dictionary.end());
        stringstream ss(sentence);
        string word;
        string result = "";
        
        while (ss >> word) {
            string prefix = "";
            string replacement = "";
            
            for (int i = 0; i < word.size(); i++) {
                prefix += word[i];
                if (st.find(prefix) != st.end()) {
                    replacement = prefix;
                    break;
                }
            }
            
            if (replacement != "")
                result += replacement;
            else
                result += word;
            
            result += " ";
        }
        
        result.pop_back();
        return result;
    }
};