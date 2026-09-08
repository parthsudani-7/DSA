import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long diff = y - x;
            long total = 0;
            long i = 0;

            while (i < k) {
                long currentX = x + i;
                long q = diff / currentX;

                if (q == 0) {
                    total += (k - i) * diff;
                    break;
                }

                long lastX = diff / q;
                long lastI = Math.min(k - 1, lastX - x);

                long count = lastI - i + 1;
                long sum = (currentX + x + lastI) * count / 2;

                total += count * diff - q * sum;
                i = lastI + 1;
            }

            sb.append(total).append('\n');
        }

        System.out.print(sb);
    }
}
