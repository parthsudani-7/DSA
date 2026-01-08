#include<iostream>
using namespace std;

int main(){
    
    int n, a, b, c, total = 0;
    cin>> n;

    for(int i = 0; i < n; i++){
        int count = 0;
        cin >> a>>b>>c;
        if( a == 1) count++;
        if(b == 1) count++;
        if(c == 1) count++;
        if (count >= 2) total++;
    }
    cout<<total;
    return 0;

}