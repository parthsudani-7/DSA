#include <bits/stdc++.h>
using namespace std;

/* Structure for tree node
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *l, TreeNode *r) : val(x), left(l), right(r) {}
};
*/

class Solution {
public:
    bool addNode(TreeNode* rootNode, long long lo, long long hi) {

        if(rootNode == nullptr)
            return true;

        if(rootNode->val <= lo || rootNode->val >= hi)
            return false;

        if(!addNode(rootNode->left, lo, rootNode->val))
            return false;

        if(!addNode(rootNode->right, rootNode->val, hi))
            return false;

        return true;
    }

    bool isValidBST(TreeNode* root) {
        long long low = LLONG_MIN;
        long long high = LLONG_MAX;

        return addNode(root, low, high);
    }
};