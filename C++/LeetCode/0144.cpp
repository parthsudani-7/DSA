#include <bits/stdc++.h>
using namespace std;

/* Structure for tree node
struct Node {
    int data;
    Node *lptr;
    Node *rptr;
    Node() : data(0), lptr(nullptr), rptr(nullptr) {}
    Node(int x) : data(x), lptr(nullptr), rptr(nullptr) {}
    Node(int x, Node *l, Node *r) : data(x), lptr(l), rptr(r) {}
};
*/
class Solution {
public:
    vector<int> result;

    vector<int> preorderTraversal(TreeNode* root) {

        if(root == nullptr)
            return result;

        result.push_back(root->val);
        preorderTraversal(root->left);
        preorderTraversal(root->right);

        return result;
    }
};