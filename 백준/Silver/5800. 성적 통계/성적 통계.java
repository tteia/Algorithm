import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        for (int i = 1; i <= K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            ArrayList<Integer> scores = new ArrayList<>();

            while (st.hasMoreTokens()) {
                scores.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(scores);

            int max = scores.get(scores.size() - 1);
            int min = scores.get(0);
            int largestGap = 0;

            for (int j = 1; j < scores.size(); j++) {
                largestGap = Math.max(largestGap, scores.get(j) - scores.get(j - 1));
            }

            bw.write("Class " + i + "\n");
            bw.write("Max " + max + ", Min " + min + ", Largest gap " + largestGap + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
