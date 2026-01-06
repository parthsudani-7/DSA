class Solution {
public:
    bool isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
               c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }

    string sortVowels(string s) {
        vector<char> vowels;

        for (int i = 0; i < s.size(); i++) {
            if (isVowel(s[i])) {
                vowels.push_back(s[i]);
            }
        }

        sort(vowels.begin(), vowels.end());

        int index = 0;
        for (int i = 0; i < s.size(); i++) {
            if (isVowel(s[i])) {
                s[i] = vowels[index];
                index++;
            }
        }

        return s;
    }
};
