import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 4 != 0) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            int m = n / 2;

            for (int i = 1; i <= m; i++)
                System.out.print(2 * i + " ");

            for (int i = 1; i < m; i++)
                System.out.print(2 * i - 1 + " ");

            System.out.println(3 * m - 1);
        }
    }
}
