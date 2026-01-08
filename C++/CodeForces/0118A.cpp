#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    string vowels = "aeiouyAEIOUY";

    for (int i = 0; i < s.length(); i++) {
        char c = tolower(s[i]);

        if (vowels.find(c) == string::npos) {
            cout << "." << c;
        }
    }

    return 0;
}
