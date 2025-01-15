import java.io.*;

public class Main {
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        K = Integer.parseInt(input[0]);
        N = Integer.parseInt(input[1]);

        int[] lengths = new int[K];
        int max = 0;
        for (int i = 0; i < K; i++) {
            lengths[i] = Integer.parseInt(br.readLine());
            if (lengths[i] > max) {
                max = lengths[i];
            }
        }

        long left = 1, right = max;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for (int i = 0; i < K; i++) {
                cnt += lengths[i] / mid;
            }
            if (cnt >= N) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
