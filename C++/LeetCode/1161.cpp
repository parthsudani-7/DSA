class Solution {
public:
    long long getSum(TreeNode* root, int level) {
        if (root == NULL) {
            return 0;
        }

        if (level == 1) {
            return root->val;
        }

        return getSum(root->left, level - 1) + getSum(root->right, level - 1);
    }

    int getHeight(TreeNode* root) {
        if (root == NULL) {
            return 0;
        }

        int left = getHeight(root->left);
        int right = getHeight(root->right);

        if (left > right) {
            return left + 1;
        }
        return right + 1;
    }

    int maxLevelSum(TreeNode* root) {
        if (root == NULL) {
            return 0;
        }

        int height = getHeight(root);
        long long maxSum = -1000000000;
        int ansLevel = 1;

        for (int i = 1; i <= height; i++) {
            long long sum = getSum(root, i);

            if (sum > maxSum) {
                maxSum = sum;
                ansLevel = i;
            }
        }

        return ansLevel;
    }
};