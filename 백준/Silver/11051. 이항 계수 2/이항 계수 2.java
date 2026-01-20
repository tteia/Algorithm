import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] A = new int[1001][1001];

        for(int i=0; i<=N; i++){
          A[i][0] = 1;
          A[i][i] = 1;
          A[i][1] = i;
        }
        for(int i=1; i<=N; i++){
            for(int j=1; j<=K; j++){
                A[i][j] = (A[i-1][j-1] + A[i-1][j]) % 10007;
            }
        }
        System.out.println(A[N][K]);

    }
}