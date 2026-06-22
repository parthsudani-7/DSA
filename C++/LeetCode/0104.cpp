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
 */

class Solution {
public:
    int calculateDepth(TreeNode* startNode) {

        if(startNode == nullptr)
            return 0;

        int leftLevel = calculateDepth(startNode->left);
        int rightLevel = calculateDepth(startNode->right);

        return max(leftLevel, rightLevel) + 1;
    }

    int maxDepth(TreeNode* root) {
        return calculateDepth(root);
    }
};