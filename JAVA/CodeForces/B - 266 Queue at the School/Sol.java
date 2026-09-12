import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();

        char[] a = s.toCharArray();

        while (t-- > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == 'B' && a[i + 1] == 'G') {
                    a[i] = 'G';
                    a[i + 1] = 'B';
                    i++;
                }
            }
        }

        System.out.println(new String(a));
    }
}
