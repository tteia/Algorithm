import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), "*");
        String start = st.nextToken();
        String end = st.nextToken();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (name.startsWith(start) && name.endsWith(end) && name.length() >= start.length() + end.length()) {
                bw.write("DA");
            } else {
                bw.write("NE");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
