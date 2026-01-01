#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    string s;
    cin >> s;

    string nums;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] != '+') {
            nums.push_back(s[i]);
        }
    }
    sort(nums.begin(), nums.end());

    for (int i = 0; i < nums.length(); i++) {
        cout << nums[i];
        if (i != nums.length() - 1)
            cout << "+";
    }

    return 0;
}
