import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (x1, x2) -> {
                int num1 = Math.abs(x1);
                int num2 = Math.abs(x2);
                if (num1 == num2) {
                    return x1 - x2;
                }
                return num1 - num2;
            }
        );

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pq.isEmpty()) {
                    bw.write("0");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(pq.poll()));
                    bw.newLine();
                }
            } else {
                pq.add(x);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
