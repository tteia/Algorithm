import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken()) - 1;
        StringTokenizer str = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (str.hasMoreTokens()){
            list.add(Integer.parseInt(str.nextToken()));
        }

        Collections.sort(list);

        bw.write(String.valueOf(list.get(K)));
        bw.flush();
        bw.close();
        br.close();
    }
}
