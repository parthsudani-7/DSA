class Solution {
public:
    int maximizeSquareArea(int m, int n, vector<int>& hFences, vector<int>& vFences) {
        long long mod = 1000000007;

        hFences.push_back(1);
        hFences.push_back(m);
        vFences.push_back(1);
        vFences.push_back(n);

        sort(hFences.begin(), hFences.end());
        sort(vFences.begin(), vFences.end());

        unordered_set<int> hs;

        for (int i = 0; i < (int)hFences.size(); i++) {
            for (int j = i + 1; j < (int)hFences.size(); j++) {
                hs.insert(hFences[j] - hFences[i]);
            }
        }

        long long best = -1;

        for (int i = 0; i < (int)vFences.size(); i++) {
            for (int j = i + 1; j < (int)vFences.size(); j++) {
                int d = vFences[j] - vFences[i];
                if (hs.find(d) != hs.end()) {
                    best = max(best, (long long)d);
                }
            }
        }

        if (best == -1) return -1;

        long long area = (best * best) % mod;
        return (int)area;
    }
};
