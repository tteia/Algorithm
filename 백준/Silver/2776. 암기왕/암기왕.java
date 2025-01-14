import java.io.*;
import java.util.HashSet;

public class Main {
    static int N, M, T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            HashSet<Integer> set = new HashSet<>();
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                set.add(Integer.parseInt(arr[j]));
            }

            M = Integer.parseInt(br.readLine());
            arr = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                if(set.contains(Integer.parseInt(arr[j]))) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
