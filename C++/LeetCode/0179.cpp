class Solution {
public:
    static bool cmp(string a, string b) {
        string ab = a + b;
        string ba = b + a;
        return ab > ba;
    }

    string largestNumber(vector<int>& nums) {
        int n = nums.size();
        vector<string> arr;

        for (int i = 0; i < n; i++) {
            arr.push_back(to_string(nums[i]));
        }

        sort(arr.begin(), arr.end(), cmp);

        if (arr[0] == "0") return "0";

        string result = "";
        for (int i = 0; i < n; i++) {
            result += arr[i];
        }

        return result;
    }
};