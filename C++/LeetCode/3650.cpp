class Solution {
public:
    int minCost(int n, vector<vector<int>>& edges) {
        vector<vector<pair<int,int>>> g(n);
        
        for (auto &e : edges) {
            int u = e[0], v = e[1], w = e[2];
            g[u].push_back({v, w});
            g[v].push_back({u, 2 * w});
        }
        
        vector<long long> dist(n, 1e18);
        priority_queue<pair<long long,int>, vector<pair<long long,int>>, greater<>> pq;
        
        dist[0] = 0;
        pq.push({0, 0});
        
        while (!pq.empty()) {
            auto cur = pq.top();
            pq.pop();
            
            long long cost = cur.first;
            int node = cur.second;
            
            if (cost != dist[node]) continue;
            
            for (auto &nx : g[node]) {
                int to = nx.first;
                int w = nx.second;
                
                if (dist[to] > cost + w) {
                    dist[to] = cost + w;
                    pq.push({dist[to], to});
                }
            }
        }
        
        if (dist[n-1] == 1e18) return -1;
        return (int)dist[n-1];
    }
};
