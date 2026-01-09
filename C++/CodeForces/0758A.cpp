#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    long long a[105];
    long long mx = 0;

    for (int i = 0; i < n; i++) {
        cin >> a[i];
        if (a[i] > mx) {
            mx = a[i];
        }
    }

    long long sum = 0;
    for (int i = 0; i < n; i++) {
        sum += (mx - a[i]);
    }

    cout << sum << endl;
    return 0;
}
