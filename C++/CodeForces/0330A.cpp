#include <bits/stdc++.h>
using namespace std;

int main() {
    int r, c;
    cin >> r >> c;

    vector<string> cake(r);
    for (int i = 0; i < r; i++) {
        cin >> cake[i];
    }

    vector<bool> goodRow(r, true);
    vector<bool> goodCol(c, true);

    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            if (cake[i][j] == 'S') {
                goodRow[i] = false;
            }
        }
    }

    for (int j = 0; j < c; j++) {
        for (int i = 0; i < r; i++) {
            if (cake[i][j] == 'S') {
                goodCol[j] = false;
            }
        }
    }

    vector<vector<bool>> eaten(r, vector<bool>(c, false));
    int ans = 0;
    for (int i = 0; i < r; i++) {
        if (goodRow[i]) {
            for (int j = 0; j < c; j++) {
                if (!eaten[i][j]) {
                    eaten[i][j] = true;
                    ans++;
                }
            }
        }
    }
    for (int j = 0; j < c; j++) {
        if (goodCol[j]) {
            for (int i = 0; i < r; i++) {
                if (!eaten[i][j]) {
                    eaten[i][j] = true;
                    ans++;
                }
            }
        }
    }

    cout << ans << endl;
    return 0;
}
