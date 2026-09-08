import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine());

            int zeroCount = 0;
            int first = 0, last = 0;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 0) zeroCount++;
                if (i == 0) first = x;
                if (i == n - 1) last = x;
            }

            if (zeroCount < 2) {
                sb.append(-1).append('\n');
            } else {
                int operations = 0;
                if (first == 1) operations++;
                if (last == 1) operations++;
                sb.append(operations).append('\n');
            }
        }

        System.out.print(sb);
    }
}
