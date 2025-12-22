#include<iostream>
using namespace std;

int main(){
    int arr[10]={1,0,1,0,1,0,1,1,0,0};
    int s=0,e=9;
    while(s<e){
        if(arr[s]==0){
            s++;
        }
        else if(arr[e]==1){
            e--;
        }else if(arr[s]==1 && arr[e]==0){
            swap(arr[s],arr[e]);
            s++;
            e--;
        }
    }
    for(int i=0;i<10;i++){
        cout<<"Element: "<<arr[i]<<endl;
    }
    return 0;
}