
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int num, n;
    cout<<"Enter Number: ";
    cin>>num;
    cout<<"Enter how many times you want to rotate: ";
    cin>>n;
    int j = -1;
    int temp = num;
    while(temp > 0){
        j++;
        temp = temp / 10;
    }

    int rem = 0;
    int i = 0;
    while(i < n){
        rem = num % 10;
        num = num / 10;
        num = num +  rem * (pow(10, j));
        i++;
    }
    cout<<num<<endl;
    return 0;
}