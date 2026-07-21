class Solution {

    boolean check(int[] houses, int[] heaters, int radius) {

        int i = 0, j = 0;

        while (i < houses.length && j < heaters.length) {

            int left = heaters[j] - radius;
            int right = heaters[j] + radius;

            if (houses[i] < left)
                return false;

            if (houses[i] <= right) {
                i++;
            } else {
                j++;
            }
        }

        return i == houses.length;
    }

    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int start = 0;
        int end = 1000000000;   // <-- Fix

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (check(houses, heaters, mid))
                end = mid - 1;
            else
                start = mid + 1;
        }

        return start;
    }
}
