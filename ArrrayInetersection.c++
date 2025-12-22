#include <iostream>
using namespace std;

int merge(int arr1[], int arr2[], int arr3[]) {
    int i = 0, j = 0, k = 0;

    while (i < 10 && j < 10) {
        if (arr1[i] == arr2[j]) {
            arr3[k++] = arr1[i];
            i++;
            j++;
        } else if (arr1[i] < arr2[j]) {
            i++;
        } else {
            j++;
        }
    }
    return k;
}

void printarr(int arr3[], int size) {
    cout<<"Elements are: "<<endl;
    for (int i = 0; i < size; i++) {
        cout << "Element: " << arr3[i] << endl;
    }
}

int main() {
    int arr1[10] = {1,2,3,4,5,6,7,8,9,10};
    int arr2[10] = {2,4,6,8,10,12,14,16,19,20};
    int arr3[10];

    int size = merge(arr1, arr2, arr3);
    printarr(arr3, size);

    return 0;
}
