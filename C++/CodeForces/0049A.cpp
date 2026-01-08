#include <iostream>
#include <string>
#include <cctype>
using namespace std;

int main() {
    string s;
    getline(cin, s);

    for(int i = s.length() - 1; i >= 0; i--) {
        if(isalpha(s[i])) {
            char ch = tolower(s[i]);

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' || ch == 'y') {
                cout << "YES";
            } else {
                cout << "NO";
            }
            break;
        }
    }

    return 0;
}
