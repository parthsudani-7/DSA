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
    bool mirrorTest(TreeNode* x, TreeNode* y) {
        if(x == NULL && y == NULL)
            return true;

        if(x == NULL || y == NULL)
            return false;

        bool sameVal = (x->val == y->val);
        bool outerPair = mirrorTest(x->left, y->right);
        bool innerPair = mirrorTest(x->right, y->left);

        return sameVal && outerPair && innerPair;
    }

    bool isSymmetric(TreeNode* root) {
        if(root == NULL)
            return true;

        return mirrorTest(root->left, root->right);
    }
};