import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long p = Long.parseLong(st.nextToken());

            long[] a = new long[n];
            long[] b = new long[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(st.nextToken());
            }

            long[][] c = new long[n][2];

            for (int i = 0; i < n; i++) {
                c[i][0] = b[i];
                c[i][1] = a[i];
            }

            Arrays.sort(c, (x, y) -> Long.compare(x[0], y[0]));

            long ans = p;
            long done = 1;

            for (int i = 0; i < n; i++) {
                if (done >= n) break;

                long cost = Math.min(c[i][0], p);
                long can = Math.min(c[i][1], n - done);

                ans += can * cost;
                done += can;
            }

            if (done < n) {
                ans += (n - done) * p;
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}
