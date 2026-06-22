class Solution {
public:
    vector<string> res;

    void dfs(string curr, int n) {
        if(curr.length() == n){
            res.push_back(curr);
            return;
        }

        for(char c : {'a','b','c'}) {
            if(curr.empty() || curr.back() != c) {
                dfs(curr + c, n);
            }
        }
    }

    string getHappyString(int n, int k) {
        dfs("", n);

        if(res.size() < k) return "";
        return res[k-1];
    }
};0