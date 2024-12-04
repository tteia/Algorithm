import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<int[]> dots = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dots.add(new int[]{x, y});
        }
        
        dots.sort((d1, d2) -> {
            if (d1[0] == d2[0]) {
                return Integer.compare(d1[1], d2[1]);
            }
            return Integer.compare(d1[0], d2[0]);
        });
        
        for (int[] dot : dots) {
            bw.write(dot[0] + " " + dot[1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
