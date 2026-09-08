import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;

        int qrTNum = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();

        while (qrTNum-- > 0) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;

            int n = Integer.parseInt(line.trim());
            String s = br.readLine().trim();

            long low = 1, high = n + 2;
            long ans = -1;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (check(mid, s, n)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }

    private static boolean check1(String s, int n) {
        long L = 0, R = 0;
        for (int i = 1; i <= n; i++) {
            char ch = s.charAt(i - 1);
            long nL, nR;
            if (ch == '+') {
                long minVal = (i % 2 == 1) ? 1 : 2;
                nL = Math.max(minVal, L - 1);
                if (nL % 2 != i % 2) nL++;
                nR = R + 1;
                if (nR % 2 != i % 2) nR--;
            } else if (ch == '-') {
                long maxVal = (i % 2 == 1) ? -1 : -2;
                nR = Math.min(maxVal, R + 1);
                if (Math.abs(nR % 2) != i % 2) nR--;
                nL = L - 1;
                if (Math.abs(nL % 2) != i % 2) nL++;
            } else {
                if (i % 2 != 0) return false;
                if (0 >= L - 1 && 0 <= R + 1) {
                    nL = 0;
                    nR = 0;
                } else {
                    return false;
                }
            }
            if (nL > nR) return false;
            L = nL;
            R = nR;
        }
        return true;
    }

    private static boolean check(long C, String s, int n) {
        if (C == 1) return check1(s, n);

        long L = 0, R = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            long nL, nR;
            if (L == R) {
                long v = L;
                if (ch == '+') {
                    if (v <= 0) {
                        nL = Math.max(1L, v + 1);
                        nR = v + C;
                    } else if (v == 1) {
                        nL = 2;
                        nR = 1 + C;
                    } else {
                        nL = Math.max(1L, v - C);
                        nR = v + C;
                    }
                } else if (ch == '-') {
                    if (v >= 0) {
                        nL = v - C;
                        nR = Math.min(-1L, v - 1);
                    } else if (v == -1) {
                        nL = -1 - C;
                        nR = -2;
                    } else {
                        nL = v - C;
                        nR = Math.min(-1L, v + C);
                    }
                } else {
                    if (Math.abs(v) >= 1 && Math.abs(v) <= C) {
                        nL = 0;
                        nR = 0;
                    } else {
                        return false;
                    }
                }
            } else {
                if (ch == '+') {
                    nL = Math.max(1L, L - C);
                    nR = R + C;
                } else if (ch == '-') {
                    nL = L - C;
                    nR = Math.min(-1L, R + C);
                } else {
                    if (L - C <= 0 && R + C >= 0) {
                        nL = 0;
                        nR = 0;
                    } else {
                        return false;
                    }
                }
            }
            if (nL > nR) {
                return false;
            }
            L = nL;
            R = nR;
        }
        return true;
    }
}
