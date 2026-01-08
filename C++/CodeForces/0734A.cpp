#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin>>n;
  string s;
  cin>>s;
  int A = 0, D = 0;
  for (int i = 0; i < n; i ++){
    if(char(tolower(s[i]) == 'a')){
      A++;
    }
    else{
      D++;
    }
  }
    if(A < D){
      cout<< "Danik";
    }
    else if(A > D){
      cout<< "Anton";
    }
    else{
      cout<<"Friendship";
    }
  return 0;
}
