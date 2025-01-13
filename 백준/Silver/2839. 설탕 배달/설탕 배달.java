import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = N / 5; i >= 0; i--) {
            int remain = N - 5 * i;
            if (remain % 3 == 0) {
                bw.write(String.valueOf(i + remain / 3));
                bw.flush();
                return;
            }
        }

        bw.write("-1");
        bw.flush();
        bw.close();
        br.close();
    }
}
