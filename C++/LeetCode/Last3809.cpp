class Solution {
public:
    vector<int> bestTower(vector<vector<int>>& towers, vector<int>& center, int radius) {

        
        int cx = center[0];
        int cy = center[1];
        int bestQuality = -1;
        int ansX = -1;
        int ansY = -1;

        for (int i = 0; i < towers.size(); i++) {
            int x = towers[i][0];
            int y = towers[i][1];
            int q = towers[i][2];

            int dist = abs(x - cx) + abs(y - cy);

            if (dist <= radius) {
                if (q > bestQuality) {
                    bestQuality = q;
                    ansX = x;
                    ansY = y;
                } 
                else if (q == bestQuality) {
                    if (x < ansX || (x == ansX && y < ansY)) {
                        ansX = x;
                        ansY = y;
                    }
                }
            }
        }

        return {ansX, ansY};
    }
};
