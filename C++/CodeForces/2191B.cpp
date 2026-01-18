#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    
    scanf("%d", &t);
    
    
    
    
    while(t--){
        int n;
        scanf("%d", &n);
        
        
        
        vector<int> a(n);
        for(int i=0;i<n;i++) scanf("%d", &a[i]);

        bool ok = true;
        
        
        for(int i=0;i<n-1;i++){
            if((a[i]%2) == (a[i+1]%2)){
                ok = false;
                
                break;
            }
        }

        printf("%s\n", ok ? "YES" : "NO");
    }
    return 0;
}
