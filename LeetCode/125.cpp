class Solution {
public:
    bool isPalindrome(string s) {
        int start = 0, end = s.size() - 1;

        while (start < end) {
            if (!isalnum((unsigned char)s[start])) {
                start++;
            }
            else if (!isalnum((unsigned char)s[end])) {
                end--;
            }
            else if (tolower((unsigned char)s[start]) != 
                     tolower((unsigned char)s[end])) {
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }
};