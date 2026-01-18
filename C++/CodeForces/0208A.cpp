#include <iostream>
#include <string>
using namespace std;

int main() {
    string s;
    cin >> s;

    string ans = "";
    int n = s.size();

    for (int i = 0; i < n; ) {
        if (i + 2 < n && s[i] == 'W' && s[i+1] == 'U' && s[i+2] == 'B') {
            if (!ans.empty() && ans.back() != ' ')
                ans += ' ';
            i += 3;
        } else {
            ans += s[i];
            i++;
        }
    }

    while (!ans.empty() && ans.back() == ' ')
        ans.pop_back();

    cout << ans << "\n";
    return 0;
}
 