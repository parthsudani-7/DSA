class Solution {
    public int score(String[] cards, char x) {
        int[] left = new int[10];
        int[] right = new int[10];
        int same = 0;

        for (String card : cards) {
            char a = card.charAt(0);
            char b = card.charAt(1);

            if (a != x && b != x) {
                continue;
            }

            if (a == x && b == x) {
                same++;
            } else if (a == x) {
                left[b - 'a']++;
            } else {
                right[a - 'a']++;
            }
        }

        int leftTotal = 0, rightTotal = 0;
        int leftMax = 0, rightMax = 0;

        for (int i = 0; i < 10; i++) {
            leftTotal += left[i];
            rightTotal += right[i];
            leftMax = Math.max(leftMax, left[i]);
            rightMax = Math.max(rightMax, right[i]);
        }

        int ans = 0;

        for (int useLeft = 0; useLeft <= same; useLeft++) {
            int useRight = same - useLeft;

            int leftPairs = getPairs(leftTotal, leftMax, useLeft);
            int rightPairs = getPairs(rightTotal, rightMax, useRight);

            ans = Math.max(ans, leftPairs + rightPairs);
        }

        return ans;
    }

    private int getPairs(int total, int maxFreq, int special) {
        return Math.min(
            total,
            Math.min(
                (total + special) / 2,
                total - maxFreq + special
            )
        );
    }
}
