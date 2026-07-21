import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prefix = new int[n];

        for (int i = 0; i < n; i++) {
            int worms = sc.nextInt();

            if (i == 0) {
                prefix[i] = worms;
            } else {
                prefix[i] = prefix[i - 1] + worms;
            }
        }

        int m = sc.nextInt();

        while (m-- > 0) {
            int q = sc.nextInt();

            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (prefix[mid] >= q) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(left + 1);
        }

        sc.close();
    }
}
