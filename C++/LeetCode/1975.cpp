class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        long long sum = 0;
        int neg = 0;
        int mn = INT_MAX;

        for(int i = 0; i < matrix.size(); i++){
            for(int j = 0; j < matrix[i].size(); j++){
                int v = matrix[i][j];

                if(v < 0){
                    neg++;
                }

                int av = abs(v);
                sum += av;

                if(av < mn){
                    mn = av;
                }
            }
        }

        if(neg % 2 == 1){
            sum = sum - 2 * mn;
        }

        return sum;
    }
};
