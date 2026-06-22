#include <bits/stdc++.h>
using namespace std;
/* Structure for binary tree node
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int v) : val(v), left(nullptr), right(nullptr) {}
    TreeNode(int v, TreeNode *l, TreeNode *r) : val(v), left(l), right(r) {}
};
*/
class Solution {
public:
    TreeNode* insert(TreeNode* nd, int val) {
        if(nd == nullptr)
            return new TreeNode(val);

        if(val < nd->val)
            nd->left = insert(nd->left, val);
        else
            nd->right = insert(nd->right, val);

        return nd;
    }

    TreeNode* insertIntoBST(TreeNode* rootNode, int val) {
        return insert(rootNode, val);
    }
};