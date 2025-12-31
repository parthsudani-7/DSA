#include <iostream>
#include <cctype>
using namespace std;

int main() {
    string a, b;
    cin >> a >> b;

    int ans = 0;

    for (int i = 0; i < a.length(); i++) {
        if (tolower(a[i]) < tolower(b[i])) {
            ans = -1;
            break;
        } 
        else if (tolower(a[i]) > tolower(b[i])) {
            ans = 1;
            break;
        }
    }

    cout << ans;
    return 0;
}
