class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        
        vector<vector<int>> ans;
        if(root == NULL) return ans;

        queue<TreeNode*> q;
        q.push(root);

        while(!q.empty()) {

            int sz = q.size();
            vector<int> level;

            for(int i = 0; i < sz; i++) {
                TreeNode* cur = q.front();
                q.pop();

                level.push_back(cur->val);

                if(cur->left)
                    q.push(cur->left);

                if(cur->right)
                    q.push(cur->right);
            }

            ans.push_back(level);
        }

        return ans;
    }
};