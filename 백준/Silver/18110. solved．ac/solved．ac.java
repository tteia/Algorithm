import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] levels = new int[n];
        for(int i = 0; i < n; i++){
            levels[i] = Integer.parseInt(br.readLine());
        }

        if (n == 0) {
            bw.write("0");
        } else {
            Arrays.sort(levels);

            int remove = (int) Math.round(n * 0.15);
            int sum = 0;
            for (int i = remove; i < n - remove; i++) {
                sum += levels[i];
            }

            int result = (int) Math.round((float) sum / (n - remove * 2));
            bw.write(String.valueOf(result));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
