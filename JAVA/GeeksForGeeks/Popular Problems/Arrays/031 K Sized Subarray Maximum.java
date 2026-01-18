class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < k; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        result.add(max);

        for (int i = k; i < n; i++) {
            if (maxIndex <= i - k) {
                max = arr[i - k + 1];
                maxIndex = i - k + 1;

                for (int j = maxIndex + 1; j <= i; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        maxIndex = j;
                    }
                }
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            result.add(max);
        }

        return result;
    }
}
