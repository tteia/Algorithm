import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String chan[][] = new String[N][4];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            chan[i][0] = st.nextToken();
            chan[i][1] = st.nextToken();
            chan[i][2] = st.nextToken();
            chan[i][3] = st.nextToken();
        }

        Arrays.sort(chan, (o1, o2) -> {
            if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
                if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
                    return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
                } else
                    return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
            }
            return Integer.compare(Integer.parseInt(o1[3]), Integer.parseInt(o2[3]));
        });

        bw.write(chan[N - 1][0] + "\n" + chan[0][0] + "\n");
        bw.flush();
        bw.close();
    }
}
