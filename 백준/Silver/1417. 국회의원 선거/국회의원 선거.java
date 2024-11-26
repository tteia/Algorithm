import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Integer N = Integer.parseInt(br.readLine());
        Integer dasom = Integer.parseInt(br.readLine());
        Integer answer = 0;

        if(N == 1){
            bw.write("0");
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        for(int i = 1; i < N; i++){
            Integer candidates = Integer.parseInt(br.readLine());
            pq.add(candidates);
        }

        while (!pq.isEmpty() && pq.peek() >= dasom){
            Integer top = pq.poll();
            pq.add(top - 1);
            dasom ++;
            answer ++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
