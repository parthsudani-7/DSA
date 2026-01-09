#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    string prev, curr;
    cin >> prev;
  
    int groups = 1;  

    for (int i = 2; i <= n; i++) {
        cin >> curr;
        if (curr != prev) {
            groups++;
        }
        prev = curr;
    }

    cout << groups << "\n";
    return 0;
}