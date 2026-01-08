#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> a(n);
    int totalSum = 0;

    for(int i = 0; i < n; i++) {
        cin >> a[i];
        totalSum += a[i];
    }

    sort(a.begin(), a.end(), greater<int>());

    int mySum = 0;
    int count = 0;

    for(int i = 0; i < n; i++) {
        mySum += a[i];
        totalSum -= a[i];
        count++;

        if(mySum > totalSum) {
            break;
        }
    }

    cout << count;
    return 0;
}
