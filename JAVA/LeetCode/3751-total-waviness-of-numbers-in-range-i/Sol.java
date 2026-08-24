import java.util.ArrayList;

class Solution {
    public int totalWaviness(int num1, int num2) {
        int val = 0;

        for (int i = num1; i <= num2; i++) {
            int temp = i;
            ArrayList<Integer> arr = new ArrayList<>();
            int count = 0;

            while (temp > 0) {
                count++;
                int curr = temp % 10;
                temp /= 10;
                arr.add(curr);
            }

            for (int j = 1; j < count - 1; j++) {
                if ((arr.get(j) > arr.get(j - 1) && arr.get(j) > arr.get(j + 1)) ||
                    (arr.get(j) < arr.get(j - 1) && arr.get(j) < arr.get(j + 1))) {
                    val++;
                }
            }
        }

        return val;
    }
}
