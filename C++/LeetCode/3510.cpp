#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minimumPairRemoval(vector<int>& nums) {
        int n = nums.size();
        if (n <= 1) return 0;

        vector<long long> val(n);
        for (int i = 0; i < n; i++) val[i] = nums[i];

        vector<int> prv(n), nxt(n);
        vector<bool> alive(n, true);

        for (int i = 0; i < n; i++) {
            prv[i] = i - 1;
            nxt[i] = i + 1;
        }
        nxt[n - 1] = -1;

        auto isBad = [&](int i) -> bool {
            if (i == -1) return false;
            int j = nxt[i];
            if (j == -1) return false;
            return val[i] > val[j];
        };

        int bad = 0;
        for (int i = 0; i < n; i++) {
            if (isBad(i)) bad++;
        }

        using T = pair<long long, int>;
        priority_queue<T, vector<T>, greater<T>> pq;

        auto pushPair = [&](int i) {
            if (i == -1) return;
            int j = nxt[i];
            if (j == -1) return;
            if (!alive[i] || !alive[j]) return;
            pq.push({val[i] + val[j], i});
        };

        for (int i = 0; i < n; i++) pushPair(i);

        int ops = 0;

        while (bad > 0) {
            while (!pq.empty()) {
                auto [sum, i] = pq.top();
                pq.pop();

                if (!alive[i]) continue;
                int j = nxt[i];
                if (j == -1 || !alive[j]) continue;

                if (val[i] + val[j] != sum) continue;

                int L = prv[i];
                int R = nxt[j];

                if (isBad(L)) bad--;
                if (isBad(i)) bad--;
                if (isBad(j)) bad--;

                val[i] = val[i] + val[j];
                alive[j] = false;

                nxt[i] = R;
                if (R != -1) prv[R] = i;

                if (isBad(L)) bad++;
                if (isBad(i)) bad++;

                pushPair(L);
                pushPair(i);

                ops++;
                break;
            }
        }

        return ops;
    }
};