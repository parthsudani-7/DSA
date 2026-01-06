class Solution {
public:
    std::vector<std::string> letterCombinations(std::string digits) {
        std::vector<std::string> result;
        
        if(digits.size() == 0) {
            return result;
        }
        
        std::vector<std::string> mp(10);
        mp[2] = "abc";
        mp[3] = "def";
        mp[4] = "ghi";
        mp[5] = "jkl";
        mp[6] = "mno";
        mp[7] = "pqrs";
        mp[8] = "tuv";
        mp[9] = "wxyz";
        
        std::string temp = "";
        solve(digits, 0, mp, temp, result);
        return result;
    }
    
    void solve(std::string digits, int idx,
               std::vector<std::string>& mp,
               std::string temp,
               std::vector<std::string>& result) {
        
        if(idx == digits.size()) {
            result.push_back(temp);
            return;
        }
        
        int digit = digits[idx] - '0';
        std::string letters = mp[digit];
        
        for(int i = 0; i < letters.size(); i++) {
            solve(digits, idx + 1, mp, temp + letters[i], result);
        }
    }
};
