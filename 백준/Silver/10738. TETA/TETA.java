import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] prices = new int[K + 1];
        for (int i = 1; i <= K; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }
        int menuPrice = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] menuMeals = new int[4];
        for (int i = 0; i < 4; i++) {
            menuMeals[i] = Integer.parseInt(st.nextToken());
        }
        int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] trayCountAll = new int[K + 1];
        int totalSum = 0;
        for (int i = 0; i < T; i++) {
            int m = Integer.parseInt(st.nextToken());
            trayCountAll[m]++;
            totalSum += prices[m];
        }
        int[] trayCount = new int[4];
        for (int i = 0; i < 4; i++) {
            trayCount[i] = trayCountAll[menuMeals[i]];
        }
        int c0 = trayCount[0], c1 = trayCount[1], c2 = trayCount[2], c3 = trayCount[3];
        List<int[]> subs = new ArrayList<>();
        for (int mask = 1; mask < (1 << 4); mask++) {
            int sum = 0;
            int[] use = new int[4];
            for (int b = 0; b < 4; b++) {
                if ((mask & (1 << b)) != 0) {
                    sum += prices[menuMeals[b]];
                    use[b] = 1;
                }
            }
            int benefit = sum - menuPrice;
            if (benefit > 0) {
                subs.add(new int[]{use[0], use[1], use[2], use[3], benefit});
            }
        }
        int[][][][] dp = new int[c0 + 1][c1 + 1][c2 + 1][c3 + 1];
        for (int i = 0; i <= c0; i++) {
            for (int j = 0; j <= c1; j++) {
                for (int k = 0; k <= c2; k++) {
                    Arrays.fill(dp[i][j][k], Integer.MIN_VALUE);
                }
            }
        }
        dp[0][0][0][0] = 0;
        for (int i = 0; i <= c0; i++) {
            for (int j = 0; j <= c1; j++) {
                for (int k = 0; k <= c2; k++) {
                    for (int l = 0; l <= c3; l++) {
                        int cur = dp[i][j][k][l];
                        if (cur < 0) continue;
                        for (int[] s : subs) {
                            int ni = i + s[0];
                            int nj = j + s[1];
                            int nk = k + s[2];
                            int nl = l + s[3];
                            if (ni <= c0 && nj <= c1 && nk <= c2 && nl <= c3) {
                                int nv = cur + s[4];
                                if (nv > dp[ni][nj][nk][nl]) {
                                    dp[ni][nj][nk][nl] = nv;
                                }
                            }
                        }
                    }
                }
            }
        }
        int maxB = 0;
        for (int i = 0; i <= c0; i++) {
            for (int j = 0; j <= c1; j++) {
                for (int k = 0; k <= c2; k++) {
                    for (int l = 0; l <= c3; l++) {
                        if (dp[i][j][k][l] > maxB) {
                            maxB = dp[i][j][k][l];
                        }
                    }
                }
            }
        }
        System.out.println(totalSum - maxB);
    }
}
