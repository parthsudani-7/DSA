class Solution {
public:
    string pushDominoes(string dominoes) {
        int n = dominoes.size();
        int last = -1;
        char lastForce = 'L';

        for (int i = 0; i <= n; i++) {
            char curr;

            if (i == n) {
                curr = 'R';
            } else {
                curr = dominoes[i];
            }

            if (curr == '.') {
                continue;
            }

            if (curr == lastForce) {
                for (int k = last + 1; k < i; k++) {
                    dominoes[k] = curr;
                }
            } else if (lastForce == 'R' && curr == 'L') {
                int left = last + 1;
                int right = i - 1;

                while (left < right) {
                    dominoes[left] = 'R';
                    dominoes[right] = 'L';
                    left++;
                    right--;
                }
            }

            last = i;
            lastForce = curr;
        }

        return dominoes;
    }
};