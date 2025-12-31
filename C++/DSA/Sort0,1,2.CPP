#include<iostream>
using namespace std;

int main(){
    int arr[15]={1,0,1,2,0,2,1,0,1,2,1,2,0,0,2};
    int s=0,e=14;

    while(s<e){
        if(arr[s]==0){
            s++;
        }
        else if(arr[e]==1 || arr[e]==2){
            e--;
        }else if((arr[s]==1 || arr[s]==2) && arr[e]==0){
            swap(arr[s],arr[e]);
            s++;
            e--;
        }
        
    }
    int end=14;
    while(s<end){
        if(arr[s]==1){
            s++;
        }
        else if(arr[end]==2){
            e--;
        }else if(arr[s]==2 && arr[end]==1){
            swap(arr[s],arr[end]);
            s++;
            e--;
        }
        
    }
    for(int i=0;i<15;i++){
        cout<<"Element: "<<arr[i]<<endl;
    }
    return 0;
}