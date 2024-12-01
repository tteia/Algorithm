import java.io.*;
import java.util.*;

public class Main {

    static int cnt;
    static String answer;
    static char[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while((line = br.readLine()) != null) {
            cnt = 0;
            answer = null;
            StringTokenizer st = new StringTokenizer(line);
            String testCase = st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            arr = new char[testCase.length()];
            visited = new boolean[testCase.length()];

            dfs(0, testCase, n);
            StringBuilder sb = new StringBuilder();
            sb.append(testCase).append(" ").append(n).append(" = ");

            if(answer == null)
                sb.append("No permutation");
            else
                sb.append(answer);

            bw.write(String.valueOf(sb));
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }

    private static void dfs(int depth, String str, int n) {
        if (depth == str.length()) {
            cnt++;
            if(cnt == n) {
                answer = new String(arr);
                return;
            }
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[depth] = str.charAt(i);
                dfs(depth+1, str, n);
                visited[i] = false;
            }
        }
    }
}
