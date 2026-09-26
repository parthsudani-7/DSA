import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();

        while (tc-- > 0) {
            String s = br.readLine().trim();
            int zeros = 0, ones = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '0') zeros++;
                else ones++;
            }

            int answer = 0;
            int availableZeros = zeros;
            int availableOnes = ones;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    if (availableOnes > 0) {
                        availableOnes--;
                    } else {
                        answer = s.length() - i;
                        break;
                    }
                } else {
                    if (availableZeros > 0) {
                        availableZeros--;
                    } else {
                        answer = s.length() - i;
                        break;
                    }
                }
            }

            out.append(answer).append('\n');
        }

        System.out.print(out);
    }
}
