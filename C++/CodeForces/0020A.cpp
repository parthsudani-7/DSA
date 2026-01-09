#include <iostream>
using namespace std;

int main() {
    string s;
    cin >> s;

    string result = "";

    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '/') {
            if (result.empty() || result.back() != '/') {
                result += '/';
            }
        } else {
            result += s[i];
        }
    }

    if (result.length() > 1 && result.back() == '/') {
        result.pop_back();
    }

    cout << result << endl;
    return 0;
}
