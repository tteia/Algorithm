import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            String P = st.nextToken();
            S = S.replaceAll(P, ",");
            sb.append(S.length()).append('\n');
        }
        System.out.println(sb);
    }
}