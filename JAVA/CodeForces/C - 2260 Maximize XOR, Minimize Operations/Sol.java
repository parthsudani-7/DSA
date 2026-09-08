import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

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

            StringTokenizer st = new StringTokenizer(line);
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long S = x + y;
            long targetX = 0;

            for (int i = 60; i >= 0; i--) {
                if (((S >> i) & 1) == 1) {
                    if (targetX + (1L << i) <= x) {
                        targetX += (1L << i);
                    }
                }
            }

            long ops = x - targetX;
            sb.append(S).append(" ").append(ops).append("\n");
        }

        System.out.print(sb);
    }
}
