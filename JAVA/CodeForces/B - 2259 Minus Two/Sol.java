import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int odd = 0;
            int mod4_0 = 0;
            int mod4_2 = 0;

            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(st.nextToken());

                if ((x & 1) == 1) {
                    odd++;
                } else if (x % 4 == 0) {
                    mod4_0++;
                } else {
                    mod4_2++;
                }
            }

            int answer = Math.max(odd, Math.max(mod4_0, mod4_2));
            out.append(answer).append('\n');
        }

        System.out.print(out);
    }
}
