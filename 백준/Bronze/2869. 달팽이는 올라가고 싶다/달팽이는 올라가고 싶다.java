import java.io.*;
import java.util.*;

public class Main {

    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int dis = K - N;
        int days = dis / (N - M);

        if(dis % (N - M) != 0){
            days++;
        }

        days++;

        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();
        br.close();
    }
}
