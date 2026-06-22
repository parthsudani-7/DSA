class Solution {
public:
    int binaryGap(int n) {
        int last = -1;
        int maxDist = 0;
        int pos = 0;
        
        while (n > 0) {
            if (n & 1) {
                if (last != -1) {
                    int dist = pos - last;
                    if (dist > maxDist) {
                        maxDist = dist;
                    }
                }
                last = pos;
            }
            
            n = n >> 1;
            pos++;
        }
        
        return maxDist;
    }
};