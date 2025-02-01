import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        int n = 1;
        int sum = 0;

        while (X > sum + n) {
            sum += n;
            n++;
        }

        int diff = X - sum;

        if (n % 2 == 0) {
            bw.write(diff + "/" + (n - diff + 1));
        } else {
            bw.write((n - diff + 1) + "/" + diff);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
