class Solution {
public:
    static constexpr long long INF = 1e18;

    struct Trie {
        int id;
        Trie* next[26];
        Trie() {
            id = -1;
            for (int i = 0; i < 26; i++) next[i] = nullptr;
        }
    };

    Trie* root = new Trie();

    void insert(const string& s, int id) {
        Trie* cur = root;
        for (char c : s) {
            int x = c - 'a';
            if (!cur->next[x]) cur->next[x] = new Trie();
            cur = cur->next[x];
        }
        cur->id = id;
    }

    long long minimumCost(
        string source,
        string target,
        vector<string>& original,
        vector<string>& changed,
        vector<int>& cost
    ) {
        unordered_map<string, int> id;
        int idx = 0;

        for (int i = 0; i < original.size(); i++) {
            if (!id.count(original[i])) id[original[i]] = idx++;
            if (!id.count(changed[i])) id[changed[i]] = idx++;
        }

        int m = idx;
        vector<vector<long long>> dist(m, vector<long long>(m, INF));
        for (int i = 0; i < m; i++) dist[i][i] = 0;

        for (int i = 0; i < original.size(); i++) {
            int u = id[original[i]];
            int v = id[changed[i]];
            dist[u][v] = min(dist[u][v], (long long)cost[i]);
        }

        for (int k = 0; k < m; k++)
            for (int i = 0; i < m; i++)
                for (int j = 0; j < m; j++)
                    if (dist[i][k] < INF && dist[k][j] < INF)
                        dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]);

        for (auto& p : id)
            insert(p.first, p.second);

        int n = source.size();
        vector<long long> dp(n + 1, INF);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] == INF) continue;

            if (source[i] == target[i])
                dp[i + 1] = min(dp[i + 1], dp[i]);

            Trie* t1 = root;
            Trie* t2 = root;

            for (int j = i; j < n; j++) {
                int a = source[j] - 'a';
                int b = target[j] - 'a';

                if (!t1->next[a] || !t2->next[b]) break;

                t1 = t1->next[a];
                t2 = t2->next[b];

                if (t1->id != -1 && t2->id != -1) {
                    long long c = dist[t1->id][t2->id];
                    if (c < INF)
                        dp[j + 1] = min(dp[j + 1], dp[i] + c);
                }
            }
        }

        return dp[n] == INF ? -1 : dp[n];
    }
};
