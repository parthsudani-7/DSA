#include<iostream>
using namespace std;

int Binarysearch(int arr[], int target) {
    int s = 0, e = 9;

    while (s <= e) {
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;   // element found
        }
        else if (arr[mid] < target) {
            s = mid + 1;
        }
        else {
            e = mid - 1;
        }
    }
    return -1; // element not found
}

void Printarr(int arr[]) {
    for (int i = 0; i < 10; i++) {
        cout << "Element: " << arr[i] << endl;
    }
}

int main() {
    int arr[] = {1,2,3,4,5,6,7,8,9,10};

    int index = Binarysearch(arr, 7);
    Printarr(arr);

    if (index != -1)
        cout << "Target Element 7 found at index " << index << endl;
    else
        cout << "Target Element not found" << endl;

    return 0;
}
