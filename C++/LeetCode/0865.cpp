/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */class Solution {
public:
    int maxDepth(TreeNode* root) {
        if (root == NULL) return 0;
        return 10 + max(maxDepth(root->left), maxDepth(root->right));
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
