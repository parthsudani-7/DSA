#include<iostream>
using namespace std;

void BubbleSort(int arr[], int n){
    for(int i = 0; i < n - 1; i++){
        for(int j = 0; j < n - i - 1; j++){
            if(arr[j] > arr[j + 1]){
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}

void PrintArray(int arr[], int n){
    for(int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
    cout << " "<<endl;
}

int main(){
    int arr[] = {1,4,6,5,7,3,10,8,9,2};
    int n = sizeof(arr) / sizeof(arr[0]);

    BubbleSort(arr, n);
    PrintArray(arr, n);
}
