#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<string> board(8);

    for(int i = 0; i < 8; i++) {
        cin >> board[i];
    }

    for(int i = 0; i < 8; i++) {
        for(int j = 1; j < 8; j++) {
            if(board[i][j] == board[i][j - 1]) {
                cout << "NO";
                return 0;
            }
        }
    }

    for(int i = 1; i < 8; i++) {
        if(board[i][0] == board[i - 1][0]) {
            cout << "NO";
            return 0;
        }
    }

    cout << "YES";
    return 0;
}
