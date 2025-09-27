import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) scores[i] = sc.nextInt();

        int[] freq = new int[101];
        for (int s : scores) freq[s]++;

        int[] cutPercent = {4, 11, 23, 40, 60, 77, 89, 96, 100};
        int[] cutScore = new int[9];
        Arrays.fill(cutScore, -1);

        int[] prefix = new int[101];
        prefix[100] = freq[100];
        for (int i = 99; i >= 0; i--) prefix[i] = prefix[i + 1] + freq[i];

        for (int g = 0; g < 9; g++) {
            for (int i = 100; i >= 0; i--) {
                if (prefix[i] * 100 >= cutPercent[g] * N) {
                    cutScore[g] = i;
                    break;
                }
            }
        }

        int[] result = new int[9];
        for (int i = 0; i < N; i++) {
            int score = scores[i];
            for (int g = 0; g < 9; g++) {
                if (score >= cutScore[g]) {
                    if (g == 0 || score < cutScore[g - 1]) {
                        result[g]++;
                        break;
                    }
                    if (score >= cutScore[g - 1]) {
                        break;
                    }
                }
            }
        }

        for (int r : result) System.out.println(r);
    }
}
