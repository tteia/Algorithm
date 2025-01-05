import java.io.*;
import java.util.*;

public class Main {
    static int N, M, T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][2];
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

            int cnt = 1;
            int rank = arr[0][1];
            for (int j = 1; j < N; j++) {
                if (arr[j][1] < rank) {
                    cnt++;
                    rank = arr[j][1];
                }
            }

            bw.write(String.valueOf(cnt));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
