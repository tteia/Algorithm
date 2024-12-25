import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if (num == 6) arr[9]++;
            else arr[num]++;
        }

        arr[9] = (arr[9] + 1) / 2;

        int max = 0;
        for (int cnt : arr) {
            max = Math.max(max, cnt);
        }

        bw.write(String.valueOf(max));
        bw.flush();
    }
}
