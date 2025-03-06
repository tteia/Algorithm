import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        ArrayDeque<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int pizza = Integer.parseInt(st.nextToken());
            q.offer(new int[] {i, pizza});
        }
        
        int time = 0;
        int[] save = new int[N];
        
        while (!q.isEmpty()) {
            time++;
            int[] tmp = q.poll();
            int pizza = tmp[1] - 1;
            
            if (pizza == 0) {
                save[tmp[0]] = time;
            } else {
                q.offer(new int[] {tmp[0], pizza});
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(save[i] + " ");
        }
        bw.flush();
        
        br.close();
        bw.close();
    }
}
