#include<iostream>
using namespace std;

void SelectionSort(int arr[], int n){
    for(int i = 0; i < n - 1; i++){
        int minIndex = i;
        for(int j = i + 1; j < n; j++){
            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }
        swap(arr[i], arr[minIndex]);
    }
}

void PrintArray(int arr[], int n){
    cout << "Elements are:\n";
    for(int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
}

int main(){
    int arr[] = {3,4,1,5,7,7,8,9,10,11,8,9};
    int n = sizeof(arr) / sizeof(arr[0]);

    SelectionSort(arr, n);
    PrintArray(arr, n);
    return 0;
}
