import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 0 || N == 1) {
            bw.write("1");
        } else {
            long sum = 1;
            for (int i = 2; i <= N; i++) {
                sum *= i;
            }
            bw.write(String.valueOf(sum));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
