#include<iostream>
using namespace std;
int main() {
    long long x, step;
    cin>> x;
    long long rem =x % 5;
    step = x / 5;
    if(rem == 0){
      cout<< step;
    }else{
      cout<< step + 1;
    }
    return 0;
}