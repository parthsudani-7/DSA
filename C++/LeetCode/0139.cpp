class Solution {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
        int n = s.size();
        
        vector<bool> dp(n + 1, false);
        dp[0] = true;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                if(dp[j]) {
                    string part = s.substr(j, i - j);
                    
                    for(int k = 0; k < wordDict.size(); k++) {
                        if(wordDict[k] == part) {
                            dp[i] = true;
                            break;
                        }
                    }
                }
                if(dp[i]) {
                    break;
                }
            }
        }
        
        return dp[n];
    }
};
