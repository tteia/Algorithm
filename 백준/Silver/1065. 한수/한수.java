import java.io.*;

public class Main {
    public static boolean isHansu(int num) {
        String numStr = Integer.toString(num);

        if (numStr.length() < 3) {
            return true;
        }

        int diff = numStr.charAt(1) - numStr.charAt(0);
        for (int i = 2; i < numStr.length(); i++) {
            if (numStr.charAt(i) - numStr.charAt(i - 1) != diff) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (isHansu(i)) {
                count++;
            }
        }


        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
