import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;

        int[][] countries = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken()) - 1;
            countries[country][0] = Integer.parseInt(st.nextToken());
            countries[country][1] = Integer.parseInt(st.nextToken());
            countries[country][2] = Integer.parseInt(st.nextToken());
        }

        int[] targetCountry = countries[K];

        List<int[]> sortedCountries = new ArrayList<>();

        for (int[] country : countries) {
            sortedCountries.add(country);
        }

        sortedCountries.sort((a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0];
            if (a[1] != b[1]) return b[1] - a[1];
            return b[2] - a[2];
        });

        int rank = 1;
        int prevGold = -1, prevSilver = -1, prevBronze = -1;
        int sameRankCount = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0 || !Arrays.equals(sortedCountries.get(i), sortedCountries.get(i - 1))) {
                rank += sameRankCount;
                sameRankCount = 0;
            }
            sameRankCount++;

            if (Arrays.equals(sortedCountries.get(i), targetCountry)) {
                bw.write(String.valueOf(rank) + "\n");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
