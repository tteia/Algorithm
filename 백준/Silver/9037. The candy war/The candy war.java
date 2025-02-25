import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] candies = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < N; i++) {
                if (candies[i] % 2 == 1) candies[i]++;
            }

            int cycles = 0;
            while (!isAllEqual(candies)) {
                int[] tmp = new int[N];

                for (int i = 0; i < N; i++) {
                    tmp[i] = candies[i] / 2;
                }

                for (int i = 0; i < N; i++) {
                    candies[i] = tmp[i] + tmp[(i - 1 + N) % N];
                    if (candies[i] % 2 == 1) candies[i]++;
                }

                cycles++;
            }

            bw.write(cycles + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isAllEqual(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) return false;
        }
        return true;
    }
}