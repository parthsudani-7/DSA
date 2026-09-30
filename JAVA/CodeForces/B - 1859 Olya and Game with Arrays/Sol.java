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

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            long sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            long sum = 0;
            long globalMin = Long.MAX_VALUE;
            long minSecond = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int m = fs.nextInt();

                long first = Long.MAX_VALUE;
                long second = Long.MAX_VALUE;

                for (int j = 0; j < m; j++) {
                    long x = fs.nextLong();

                    if (x < first) {
                        second = first;
                        first = x;
                    } else if (x < second) {
                        second = x;
                    }
                }

                sum += second;
                globalMin = Math.min(globalMin, first);
                minSecond = Math.min(minSecond, second);
            }

            out.append(sum - minSecond + globalMin).append('\n');
        }

        System.out.print(out);
    }
}
