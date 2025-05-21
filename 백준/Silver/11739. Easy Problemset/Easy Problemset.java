import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] problems = new int[n][];
        int[] ptr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            problems[i] = new int[p];
            for (int j = 0; j < p; j++) {
                problems[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        long totalHardness = 0;
        int selected = 0;
        int judge = 0;
        while (selected < k) {
            boolean allEasyDone = true;
            for (int i = 0; i < n; i++) {
                if (ptr[i] < problems[i].length) {
                    allEasyDone = false;
                    break;
                }
            }
            if (allEasyDone) {
                totalHardness += (long)(k - selected) * 50;
                break;
            }
            int h;
            if (ptr[judge] < problems[judge].length) {
                h = problems[judge][ptr[judge]++];
            } else {
                h = 50;
            }
            if (h >= totalHardness) {
                totalHardness += h;
                selected++;
            }
            judge = (judge + 1) % n;
        }
        System.out.println(totalHardness);
    }
}
