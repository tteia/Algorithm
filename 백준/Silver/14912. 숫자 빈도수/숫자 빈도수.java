import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        char d = input[1].charAt(0);

        int count = 0;
        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i);
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == d) {
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();
    }
}
