import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> accounts = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            String site = s.nextToken();
            String password = s.nextToken();
            accounts.put(site, password);
        }
        for(int i = 0; i < M; i++){
            String line = br.readLine();
            bw.write(accounts.get(line));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
