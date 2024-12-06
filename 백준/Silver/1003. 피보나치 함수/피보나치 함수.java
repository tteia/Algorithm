import java.io.*;

public class Main {

    static int cntZero;
    static int cntOne;

    public static void fibonacci(int n) {
        if (n == 0) {
            cntZero = 1;
            cntOne = 0;
        } else if (n == 1) {
            cntZero = 0;
            cntOne = 1;
        } else {
            int prevZero = 1, prevOne = 0; // fibonacci(0)
            int currZero = 0, currOne = 1; // fibonacci(1)

            for (int i = 2; i <= n; i++) {
                int nextZero = prevZero + currZero;
                int nextOne = prevOne + currOne;

                prevZero = currZero;
                prevOne = currOne;
                currZero = nextZero;
                currOne = nextOne;
            }

            cntZero = currZero;
            cntOne = currOne;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            cntZero = 0;
            cntOne = 0;
            fibonacci(N);
            sb.append(cntZero).append(" ").append(cntOne).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
