class Solution {
    public int countAtMostK(int arr[], int k) {
        if (k == 0) return 0;

        int n = arr.length;
        int[] freq = new int[100001];   
        int left = 0;
        int distinct = 0;
        int result = 0;

        for (int right = 0; right < n; right++) {
            if (freq[arr[right]] == 0) {
                distinct++;
            }
            freq[arr[right]]++;

            while (distinct > k) {
                freq[arr[left]]--;
                if (freq[arr[left]] == 0) {
                    distinct--;
                }
                left++;
            }

            result += right - left + 1;
        }

        return result;
    }
}
