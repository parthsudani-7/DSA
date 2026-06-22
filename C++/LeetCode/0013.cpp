class Solution {
public:
    int romanToInt(string s) {
        auto val = [&](char c) {
            if (c == 'I') return 1;
            if (c == 'V') return 5;
            if (c == 'X') return 10;
            if (c == 'L') return 50;
            if (c == 'C') return 100;
            if (c == 'D') return 500;
            return 1000;
        };

        int ans = 0;
        int n = (int)s.size();

        for (int i = 0; i < n; i++) {
            int cur = val(s[i]);
            int next = (i + 1 < n) ? val(s[i + 1]) : 0;

            if (cur < next) ans -= cur;
            else ans += cur;
        }

        return ans;
    }
};