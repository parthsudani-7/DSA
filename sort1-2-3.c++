// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

void sortarr(int arr[]){
    int m=0,s=0,e=14;
    while(m<=e){
        if(arr[m]==0){
            swap(arr[m],arr[s]);
            s++;
            m++;
        }else if(arr[m]==1){
            m++;
        }else{
            swap(arr[e],arr[m]);
            e--;
        }
    }
}
void printarr(int arr[]){
    for(int i=0 ; i <14;i++){
        cout<<"Element :"<<arr[i]<<endl;
    } 
}
int main() {
    int arr[15]={1,2,0,2,2,1,2,0,0,1,0,1,2,1,0};
    sortarr(arr);
    printarr(arr);
    return 0;
            
}