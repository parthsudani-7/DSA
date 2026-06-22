#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    long long minimumCost(vector<int>& nums, int k, int dist) {

        int n = nums.size();
        int need = k - 2;

        multiset<int> take, skip;
        long long sum = 0;

        auto balance = [&]() {
            while (take.size() > need) {
                auto it = prev(take.end());
                sum -= *it;
                skip.insert(*it);
                take.erase(it);
            }

            while (take.size() < need && !skip.empty()) {
                auto it = skip.begin();
                sum += *it;
                take.insert(*it);
                skip.erase(it);
            }

            if (!take.empty() && !skip.empty()) {
                while (*prev(take.end()) > *skip.begin()) {
                    auto big = prev(take.end());
                    auto small = skip.begin();

                    sum -= *big;
                    sum += *small;

                    take.insert(*small);
                    skip.insert(*big);

                    take.erase(big);
                    skip.erase(small);
                }
            }
        };

        int L = 2;
        int R = min(n-1, 1 + dist);

        for (int i=L;i<=R;i++){
            take.insert(nums[i]);
            sum += nums[i];
        }

        balance();

        long long ans = LLONG_MAX;

        for (int i=1;i<=n-2;i++){

            if(take.size()==need)
                ans = min(ans, (long long)nums[0] + nums[i] + sum);

            int removeIdx = i+1;
            int addIdx = i+dist+1;

            if(removeIdx <= n-1){
                if(take.find(nums[removeIdx]) != take.end()){
                    sum -= nums[removeIdx];
                    take.erase(take.find(nums[removeIdx]));
                }
                else{
                    skip.erase(skip.find(nums[removeIdx]));
                }
            }

            if(addIdx <= n-1){
                if(!take.empty() && nums[addIdx] < *prev(take.end())){
                    take.insert(nums[addIdx]);
                    sum += nums[addIdx];
                }
                else{
                    skip.insert(nums[addIdx]);
                }
            }

            balance();
        }

        return ans;
    }
};
