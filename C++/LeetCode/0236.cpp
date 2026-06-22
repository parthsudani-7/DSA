#include <bits/stdc++.h>
using namespace std;

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* curNode, TreeNode* a, TreeNode* b) {

        if(curNode == NULL || curNode == a || curNode == b)
            return curNode;

        TreeNode* leftPart = lowestCommonAncestor(curNode->left, a, b);
        TreeNode* rightPart = lowestCommonAncestor(curNode->right, a, b);

        if(leftPart != NULL && rightPart != NULL)
            return curNode;

        if(leftPart != NULL)
            return leftPart;

        return rightPart;
    }
};