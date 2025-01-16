import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        if(N % 2 == 0) bw.write("CY");
        else bw.write("SK");

        bw.flush();
        bw.close();
        br.close();
    }
}
