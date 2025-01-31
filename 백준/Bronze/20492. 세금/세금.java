import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        sb.append((int)(N * 0.78)).append(" ");
        sb.append(N - (int)((N * 0.2)*0.22));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
