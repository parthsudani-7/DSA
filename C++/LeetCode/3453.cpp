class Solution {
public:
    double separateSquares(vector<vector<int>>& squares) {
        double left = 1e18, right = -1e18;
        double totalArea = 0;

        for (auto &sq : squares) {
            double y = sq[1];
            double side = sq[2];
            left = min(left, y);
            right = max(right, y + side);
            totalArea += side * side;
        }

        double halfArea = totalArea / 2.0;

        for (int step = 0; step < 80; step++) {
            double mid = (left + right) / 2.0;
            double belowArea = 0;

            for (auto &sq : squares) {
                double y = sq[1];
                double side = sq[2];
                double bottom = y;
                double top = y + side;

                if (mid <= bottom) {
                    belowArea += 0;
                } 
                else if (mid >= top) {
                    belowArea += side * side;
                } 
                else {
                    belowArea += (mid - bottom) * side;
                }
            }

            if (belowArea >= halfArea) right = mid;
            else left = mid;
        }

        return right;
    }
};
