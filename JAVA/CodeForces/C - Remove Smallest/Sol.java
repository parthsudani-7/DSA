import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (n == 1) {
                System.out.println("YES");
                continue;
            }

            Arrays.sort(arr);

            boolean ans = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] > 1) {
                    ans = false;
                    break;
                }
            }

            System.out.println(ans ? "YES" : "NO");
        }

        sc.close();
    }
}
