import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        // 여행에 필요한 N개의 물건
        // 물건은 무게 W , 가치 V, 최대 K 만큼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        int[] dp = new int[K + 1];
        
        for(int i = 0; i < N; i++){
            str = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(str.nextToken());
            int V = Integer.parseInt(str.nextToken());
            for(int w = K; w >= W; w--){
                dp[w] = Math.max(dp[w], dp[w - W] + V);
            }
        }
        
        System.out.println(dp[K]);
    }
}
