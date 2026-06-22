#include <bits/stdc++.h>
using namespace std;

class Solution {
public:

    bool isOperator(string s) {
        return s == "+" || s == "-" || s == "*" || s == "/";
    }

    int apply(int a, int b, string op) {
        if (op == "+") return a + b;
        if (op == "-") return a - b;
        if (op == "*") return a * b;
        return a / b; 
    }

    int evalRPN(vector<string>& tokens) {
        stack<int> stk;

        for (string s : tokens) {
            if (isOperator(s)) {
                int b = stk.top(); stk.pop();
                int a = stk.top(); stk.pop();

                int res = apply(a, b, s);
                stk.push(res);
            } 
            else {
                stk.push(stoi(s));
            }
        }

        return stk.top();
    }
};