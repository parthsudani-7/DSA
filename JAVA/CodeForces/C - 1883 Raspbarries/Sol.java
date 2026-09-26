import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int ans = k;
            int even = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                ans = Math.min(ans, (k - x % k) % k);

                if (x % 2 == 0) {
                    even++;
                }
            }

            if (k == 4) {
                if (even >= 2) {
                    ans = 0;
                } else if (even == 1) {
                    ans = Math.min(ans, 1);
                } else {
                    ans = Math.min(ans, 2);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
