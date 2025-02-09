import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] titles = new String[N];
        int[] indices = new int[N];
        int[] difficulties = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            titles[i] = st.nextToken();
            indices[i] = Integer.parseInt(st.nextToken());
            difficulties[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] sortedIndices = new Integer[N];
        for (int i = 0; i < N; i++) {
            sortedIndices[i] = i;
        }

        Arrays.sort(sortedIndices, Comparator.comparingInt(a -> indices[a]));

        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            int idx = sortedIndices[i];
            char ch = titles[idx].charAt(difficulties[idx] - 1);
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            result.append(ch);
        }
        
        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
