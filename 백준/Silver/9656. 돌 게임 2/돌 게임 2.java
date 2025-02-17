import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[N + 1];

        dp[1] = false;
        if (N >= 2) dp[2] = true;
        if (N >= 3) dp[3] = false;
        if (N >= 4) dp[4] = true;
        
        for (int i = 5; i <= N; i++) {
            dp[i] = !dp[i - 1] || !dp[i - 3];
        }

        bw.write(dp[N] ? "SK\n" : "CY\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
