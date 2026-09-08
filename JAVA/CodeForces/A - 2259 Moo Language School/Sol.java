import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s = br.readLine().trim();

            int count = 0;

            for (int i = 0; i < n; i += k) {
                boolean hasZero = false;

                for (int j = i; j < i + k; j++) {
                    if (s.charAt(j) == '0') {
                        hasZero = true;
                        break;
                    }
                }

                if (!hasZero) {
                    count++;
                }
            }

            ans.append(count).append('\n');
        }

        System.out.print(ans);
    }
}
