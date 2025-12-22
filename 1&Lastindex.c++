#include <iostream>
using namespace std;

int firstIndex(int arr[], int n, int target) {
    int s = 0, e = n - 1;
    int ans = -1;

    while (s <= e) {
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            ans = mid;
            e = mid - 1;
        } else if (arr[mid] < target) {
            s = mid + 1;
        } else {
            e = mid - 1;
        }
    }
    return ans;
}

int lastIndex(int arr[], int n, int target) {
    int s = 0, e = n - 1;
    int ans = -1;

    while (s <= e) {
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            ans = mid;
            s = mid + 1;
        } else if (arr[mid] < target) {
            s = mid + 1;
        } else {
            e = mid - 1;
        }
    }
    return ans;
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int arr[] = {1,2,3,3,3,3,4,5,6,7,8,9,10};
    int n = sizeof(arr) / sizeof(arr[0]);

    printArray(arr, n);

    int first = firstIndex(arr, n, 3);
    int last = lastIndex(arr, n, 3);

    if (first != -1) {
        cout << "First index: " << first << endl;
        cout << "Last index: " << last << endl;
        cout << "Total occurrences: " << last - first + 1 << endl;
    } else {
        cout << "Element not found" << endl;
    }

    return 0;
}
