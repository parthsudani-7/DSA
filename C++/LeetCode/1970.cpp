class Solution {
public:
    int latestDayToCross(int row,int col,vector<vector<int>>& cells){
        int l=1,r=cells.size(),ans=0;

        while(true){
            int mid=(l+r)/2;

            vector<vector<int>> grid(row,vector<int>(col,0));
            for(int i=0;i<mid;i++)
                grid[cells[i][0]-1][cells[i][1]-1]=1;

            queue<pair<int,int>> q;
            vector<vector<int>> vis(row,vector<int>(col,0));

            for(int j=0;j<col;j++){
                if(grid[0][j]==0){
                    q.push({0,j});
                    vis[0][j]=1;
                }
            }

            bool ok=false;
            int dx[4]={1,-1,0,0};
            int dy[4]={0,0,1,-1};

            while(!q.empty()){
                auto [x,y]=q.front(); q.pop();
                if(x==row-1){
                    ok=true;
                    break;
                }
                for(int d=0;d<4;d++){
                    int nx=x+dx[d],ny=y+dy[d];
                    if(nx>=0 && ny>=0 && nx<row && ny<col &&
                       grid[nx][ny]==0 && !vis[nx][ny]){
                        vis[nx][ny]=1;
                        q.push({nx,ny});
                    }
                }
            }

            if(ok){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
};
