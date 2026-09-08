import java.io.*;
import java.util.*;

public class Main {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            int[] a = new int[n];

            int[] cnt = new int[n + 1];

            @SuppressWarnings("unchecked")
            ArrayList<Integer>[] pos = new ArrayList[n + 1];

            ArrayList<Integer> big = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();

                if (a[i] <= n) {
                    cnt[a[i]]++;

                    if (pos[a[i]] == null) {
                        pos[a[i]] = new ArrayList<>();
                    }
                    pos[a[i]].add(i);
                } else {
                    big.add(i);
                }
            }
            int X = 0, Y = 0, Z = 0;

            while (cnt[X] >= 3) X++;
            while (cnt[Y] >= 2) Y++;
            while (cnt[Z] >= 1) Z++;

            int x = X;
            int y = Y;
            int z = Math.min(Z, X + Y);

            if (x == 0 && y == 0 && z == 0 && cnt[0] > 0) {
                out.append("NO\n");
                continue;
            }

            char[] ans = new char[n];

            Arrays.fill(ans, 'A');

            boolean possible = true;

            for (int v = 0; v <= n && possible; v++) {
                if (pos[v] == null) {
                    continue;
                }

                ArrayList<Integer> list = pos[v];
                int ptr = 0;

                if (x > v) {
                    if (ptr >= list.size()) {
                        possible = false;
                        break;
                    }
                    ans[list.get(ptr++)] = 'A';
                }

                if (y > v) {
                    if (ptr >= list.size()) {
                        possible = false;
                        break;
                    }
                    ans[list.get(ptr++)] = 'B';
                }

                if (z > v) {
                    if (ptr >= list.size()) {
                        possible = false;
                        break;
                    }
                    ans[list.get(ptr++)] = 'C';
                }
                while (ptr < list.size()) {
                    int idx = list.get(ptr++);

                    if (x != v) {
                        ans[idx] = 'A';
                    } else if (y != v) {
                        ans[idx] = 'B';
                    } else if (z != v) {
                        ans[idx] = 'C';
                    } else {
                        possible = false;
                        break;
                    }
                }
            }

            for (int idx : big) {
                ans[idx] = 'A';
            }

            if (!possible) {
                out.append("NO\n");
            } else {
                out.append("YES\n");
                out.append(ans).append('\n');
            }
        }

        System.out.print(out);
    }
}
