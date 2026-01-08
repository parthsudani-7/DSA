#include <iostream>
using namespace std;

bool allDistinct(int year) {
    string s = to_string(year);
    for(int i = 0; i < s.length(); i++){
        for(int j = i + 1; j < s.length(); j++){
            if(s[i] == s[j]){
                return false;
            }
        }
    }
    return true;
}

int main() {
    int y;
    cin >> y;

    y = y + 1;
    while(true){
        if(allDistinct(y)){
            cout << y;
            break;
        }
        y++;
    }

    return 0;
}
