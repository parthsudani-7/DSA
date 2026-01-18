#include <iostream>
#include <string>
using namespace std;

int main() {
    string a, b, c;
    cin >> a >> b >> c;

    int cnt1[26] = {0};
    int cnt2[26] = {0};

    for (char ch : a) cnt1[ch - 'A']++;
    for (char ch : b) cnt1[ch - 'A']++;
    for (char ch : c) cnt2[ch - 'A']++;

    for (int i = 0; i < 26; i++) {
        if (cnt1[i] != cnt2[i]) {
            cout << "NO";
            return 0;
        }
    }

    cout << "YES";
    return 0;
}
