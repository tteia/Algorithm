import java.io.*;
import java.util.*;

public class Main {
    static long swapCount = 0;
    static long K;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        K = Long.parseLong(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        select(A, 0, N - 1, Q);
        System.out.println(-1);
    }
    static int select(int[] A, int p, int r, int q) {
        if (p == r) return A[p];
        int t = partition(A, p, r);
        int k = t - p + 1;
        if (q < k) {
            return select(A, p, t - 1, q);
        } else if (q == k) {
            return A[t];
        } else {
            return select(A, t + 1, r, q - k);
        }
    }
    static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (A[j] <= x) {
                i++;
                swap(A, i, j);
            }
        }
        if (i + 1 != r) {
            swap(A, i + 1, r);
        }
        return i + 1;
    }
    static void swap(int[] A, int i, int j) {
        swapCount++;
        int a = A[i], b = A[j];
        if (swapCount == K) {
            int small = a < b ? a : b;
            int large = a < b ? b : a;
            System.out.println(small + " " + large);
            System.exit(0);
        }
        A[i] = b;
        A[j] = a;
    }
}
