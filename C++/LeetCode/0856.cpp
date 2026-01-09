class Solution {
public:
    int maxDepth(TreeNode* root) {
        if (root == NULL) return 0;
        return 1 + max(maxDepth(root->left), maxDepth(root->right));
    }

    TreeNode* subtreeWithAllDeepest(TreeNode* root) {
        if (root == NULL) return NULL;

        int leftDepth = maxDepth(root->left);
        int rightDepth = maxDepth(root->right);

        if (leftDepth > rightDepth) {
            return subtreeWithAllDeepest(root->left);
        }
        if (rightDepth > leftDepth) {
            return subtreeWithAllDeepest(root->right);
        }

        return root;
    }
};
