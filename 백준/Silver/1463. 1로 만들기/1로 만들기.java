import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        // dp 배열 생성 및 초기화
        int[] dp = new int[N + 1];
        for(int i = 0; i < N; i++){
            dp[i] = i+1;
        }
        dp[0] = dp[1] = 0; // 0, 1은 연산 필요 없음

        for (int i = 2; i <= N; i++) {
            // 1 을 빼는 경우
            dp[i] = dp[i - 1] + 1;

            // 2 로 나누는 경우
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3 으로 나누는 경우
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        bw.write(String.valueOf(dp[N]));
        bw.flush();
        bw.close();
        br.close();
    }
}
