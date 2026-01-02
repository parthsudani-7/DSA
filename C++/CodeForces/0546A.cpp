#include <iostream>
using namespace std;

int main() {
    long long k, n, w;
    cin >> k >> n >> w;

    long long sum = k * w * (w + 1) / 2;
    long long ans = sum - n;

    cout << (ans > 0 ? ans : 0);
    return 0;
}
