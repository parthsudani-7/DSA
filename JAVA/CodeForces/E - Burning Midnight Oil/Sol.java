import java.util.*;

public class Main {

    static boolean check(int n, int k, int mid) {
        long ans = 0;
        long curr = mid;

        while (curr > 0) {
            ans += curr;
            if (ans >= n) {
                return true;
            }
            curr /= k;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (check(n, k, mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(start);
    }
}
