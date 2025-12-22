#include <iostream>
using namespace std;

long long root(int x) {
    long long start = 0, end = x, ans = -1;

    while (start <= end) {
        long long mid = start + (end - start) / 2;
        if (mid * mid == x)
            return mid;
        if (mid * mid > x)
            end = mid - 1;
        else {
            ans = mid;
            start = mid + 1;
        }
    }
    return ans;
}

double perfect(int x, long long intPart, int precision) {
    double ans = intPart;
    double factor = 1;

    for (int i = 0; i < precision; i++) {
        factor /= 10;
        while ((ans + factor) * (ans + factor) <= x) {
            ans += factor;
        }
    }
    return ans;
}

int main() {
    int x;
    cout << "Enter the number you want to find the square root:\n";
    cin >> x;

    long long intPart = root(x);
    cout << "Integer square root: " << intPart << endl;

    cout << "Square root (upto 3 decimals): "
         << perfect(x, intPart, 3) << endl;
}
