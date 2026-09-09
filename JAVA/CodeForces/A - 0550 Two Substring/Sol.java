import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ab = s.indexOf("AB");

        if (ab != -1) {
            int ba = s.indexOf("BA", ab + 2);

            if (ba != -1) {
                System.out.println("YES");
                return;
            }
        }

        int ba = s.indexOf("BA");

        if (ba != -1) {
            ab = s.indexOf("AB", ba + 2);

            if (ab != -1) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
