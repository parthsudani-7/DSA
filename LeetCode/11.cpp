class Solution {
public:
    int maxArea(vector<int>& height) {
        int s = 0, e = height.size() - 1;
        int best = 0;

        while (e > s) {
            int width = e - s;
            int level;

            if (height[s] < height[e]) {
                level = height[s];
                s++;
            } else {
                level = height[e];
                e--;
            }

            int area = width * level;
            if (area > best) {
                best = area;
            }
        }

        return best;
    }
};