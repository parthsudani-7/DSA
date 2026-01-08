class Solution {
public:
    long long totalSum = 0;
    long long maxAns = 0;
    const int MOD = 1e9 + 7;

    long long getTotalSum(TreeNode* root) {
        if (root == NULL) return 0;

        return root->val +
               getTotalSum(root->left) +
               getTotalSum(root->right);
    }

    int solve(TreeNode* root) {
        if (root == NULL) return 0;

        long long leftSum = solve(root->left);
        long long rightSum = solve(root->right);

        long long subTreeSum = root->val + leftSum + rightSum;

        long long product = subTreeSum * (totalSum - subTreeSum);
        maxAns = max(maxAns, product);

        return subTreeSum;
    }

    int maxProduct(TreeNode* root) {
        totalSum = getTotalSum(root);
        solve(root);

        return maxAns % MOD;
    }
};