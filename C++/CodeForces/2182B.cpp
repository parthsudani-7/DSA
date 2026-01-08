#include <bits/stdc++.h>
using namespace std;

int solve(long long white, long long dark, bool startWhite) {
    long long size = 1;
    int layers = 0;
    bool useWhite = startWhite;

    while (true) {
        if (useWhite) {
            if (white < size) {
                break;
            }
            white -= size;
        } else {
            if (dark < size) {
                break;
            }
            dark -= size;
        }

        layers++;
        size *= 2;
        useWhite = !useWhite;
    }

    return layers;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--) {
        long long a, b;
        cin >> a >> b;

        int ans1 = solve(a, b, true);   // start with white
        int ans2 = solve(a, b, false);  // start with dark

        cout << max(ans1, ans2) << "\n";
    }

    return 0;
}
