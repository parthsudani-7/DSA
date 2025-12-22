#include <iostream>
using namespace std;

void InsertionSort(int arr[], int n) {
    int i = 1;
    while (i < n) {
        int temp = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = temp;
        i++;
    }
}

void PrintArray(int arr[], int n) {
    cout << "Elements are: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
}

int main() {
    int arr[] = {3, 4, 6, 2, 7, 9, 10, 1, 5, 8};
    int n = sizeof(arr) / sizeof(arr[0]);

    InsertionSort(arr, n);
    PrintArray(arr, n);

    return 0;
}
