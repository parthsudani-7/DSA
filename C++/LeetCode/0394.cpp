class Solution {
public:
    string decodeString(string s) {
        int countArr[1000];
        string strArr[1000];

        int top = -1;
        int number = 0;
        string current = "";

        for (int i = 0; i < s.length(); i++) {
            if (s[i] >= '0' && s[i] <= '9') {
                number = number * 10 + (s[i] - '0');
            }
            else if (s[i] == '[') {
                top++;
                countArr[top] = number;
                strArr[top] = current;
                number = 0;
                current = "";
            }
            else if (s[i] == ']') {
                int repeat = countArr[top];
                string temp = strArr[top];
                top--;

                for (int j = 0; j < repeat; j++) {
                    temp += current;
                }
                current = temp;
            }
            else {
                current += s[i];
            }
        }

        return current;
    }
};