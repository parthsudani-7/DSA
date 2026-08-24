class Solution {
    public int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int ans = 0;
          
        if(cost.length % 3 == 0){
            for(int i = 0; i < cost.length - 2;){
                if( cost[i + 2] <= cost[i + 1] && cost[i] + cost[i + 1] <= cost[i + 2]){
                    ans += cost[i] + cost[i + 1];
                }
                else{
                    ans += cost[i + 1] + cost[i + 2];
                }
                i += 3;
            } 
            return ans;
        }
        
        else{
            int val = cost.length % 3;
            if(val == 1){
                for(int i = 1; i < cost.length - 2;){
                    if( cost[i + 2] <= cost[i + 1] && cost[i] + cost[i + 1] <= cost[i + 2]){
                        ans += cost[i] + cost[i + 1];
                    }
                    else{
                        ans += cost[i + 1] + cost[i + 2];
                    }
                    i += 3;
                } 
                return ans + cost[0];
            }
        }
        for(int i = 2; i < cost.length - 2;){
            if( cost[i + 2] <= cost[i + 1] && cost[i] + cost[i + 1] <= cost[i + 2]){
                ans += cost[i] + cost[i + 1];
            }
            else{
                ans += cost[i + 1] + cost[i + 2];
            }
            i += 3;
        } 
        return ans + cost[0] + cost[1];
        
        
    }
}
