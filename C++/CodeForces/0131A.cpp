#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    bool ok = true;
    for (int i = 1; i < (int)s.size(); i++) {
        if (s[i] >= 'a' && s[i] <= 'z') {
            ok = false;
            break;
        }
    }

    if (ok) {
        for (int i = 0; i < (int)s.size(); i++) {
            if (s[i] >= 'a' && s[i] <= 'z') s[i] = s[i] - 32;
            else s[i] = s[i] + 32;
        }
    }

    cout << s;
    return 0;
}
