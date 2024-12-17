import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 파도반 수열을 미리 계산 (1 ≤ N ≤ 100)
        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        // 테스트 케이스 입력
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(dp[N])); // P(N) 출력
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
