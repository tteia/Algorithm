import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cnt = 0;
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0) {
                break;
            }

            Set<Integer> set = new HashSet<>(N);
            for (int i = 0; i < N; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }

            for (int i = 0; i < M; i++) {
                if (set.contains(Integer.parseInt(br.readLine()))) {
                    cnt++;
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
