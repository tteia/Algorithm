import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] order = new int[28];
        int idx = 0;
        for (int i = 1; i <= 15; i++) {
            order[idx++] = i;
        }
        for (int i = 14; i >= 2; i--) {
            order[idx++] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            long N = Long.parseLong(br.readLine());
            int val = order[(int)((N - 1) % 28)];

            StringBuilder res = new StringBuilder();
            for (int bit = 3; bit >= 0; bit--) {
                if ((val & (1 << bit)) != 0) {
                    res.append("딸기");
                } else {
                    res.append("V");
                }
            }
            sb.append(res).append("\n");
        }
        System.out.print(sb);
    }
}
