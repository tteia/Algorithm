import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] lengths = new int[N];
        for (int i = 0; i < N; i++) {
            lengths[i] = Integer.parseInt(br.readLine());
        }

        int max = -1;

        // 이진 탐색을 사용해 최적의 P 찾기
        int left = 1, right = 1000000000;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (slice(lengths, N, K, M, mid)) {
                max = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean slice(int[] lengths, int N, int K, int M, int P) {
        long totalPieces = 0;

        for (int length : lengths) {
            if (length <= K) continue;
            int usableLength = (length < 2 * K) ? (length - K) : (length - 2 * K);
            if (usableLength >= P) {
                totalPieces += usableLength / P;
                if (totalPieces >= M) return true;
            }
        }

        return totalPieces >= M;
    }
}
