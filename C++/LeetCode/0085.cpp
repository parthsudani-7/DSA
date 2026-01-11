class Solution {
public:
    int maximalRectangle(vector<vector<char>>& matrix) {
        int n = matrix.size();
        if(n == 0) return 0;
        int m = matrix[0].size();

        vector<int> height(m, 0);
        int ans = 0;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == '1')
                    height[j] += 1;
                else
                    height[j] = 0;
            }

            for(int j = 0; j < m; j++) {
                int h = height[j];
                if(h == 0) continue;

                int left = j;
                int right = j;

                while(left >= 0 && height[left] >= h)
                    left--;

                while(right < m && height[right] >= h)
                    right++;

                int width = right - left - 1;
                int area = h * width;

                ans = max(ans, area);
            }
        }

        return ans;
    }
};
