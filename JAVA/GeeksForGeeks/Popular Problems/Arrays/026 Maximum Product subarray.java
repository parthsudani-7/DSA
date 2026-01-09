class Solution {
    int maxProduct(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

            if (curr < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(curr, maxEndingHere * curr);
            minEndingHere = Math.min(curr, minEndingHere * curr);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
