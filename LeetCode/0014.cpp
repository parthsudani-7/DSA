class Solution {
public:
    string longestCommonPrefix(vector<string>& vault) {
        if (vault.empty()){
            return "";
        }
        string seed = vault[0];

        for (int idx = 1; idx < vault.size(); idx++) {
            int probe = 0;
            while (probe < seed.size() && probe < vault[idx].size() && seed[probe] == vault[idx][probe]) {
                probe++;
            }
            seed = seed.substr(0, probe);
            if (seed.empty()){
                return "";
            }
        }

        return seed;
    }
};