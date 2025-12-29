class Solution {
    public static void difference(int n1, int n2) {
        for (int i = 1; i <= 10; i++) {
            int diff = (n1 * i) - (n2 * i);
            System.out.print(diff);
            if (i < 10) {
                System.out.print(" ");
            }
        }
    }
}
