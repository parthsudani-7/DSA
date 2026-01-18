#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> a(n);
    int ones = 0;

    for (int i = 0; i < n; i++) {
        cin >> a[i];
        if (a[i] == 1) ones++;
    }

    int bestGain = -1000;
    int current = 0;

    for (int i = 0; i < n; i++) {
        int val;
        if (a[i] == 0) val = 1;
        else val = -1;

        current += val;
        bestGain = max(bestGain, current);

        if (current < 0) current = 0;
    }

    cout << ones + bestGain << "\n";
    return 0;
}
