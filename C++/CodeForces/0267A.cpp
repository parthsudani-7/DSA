#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    while (n--) {
        long long a, b;
        cin >> a >> b;

        long long operations = 0;

        while (a > 0 && b > 0) {
            if (a >= b) {
                operations += a / b;
                a = a % b;
            } else {
                operations += b / a;
                b = b % a;
            }
        }

        cout << operations << "\n";
    }

    return 0;
}