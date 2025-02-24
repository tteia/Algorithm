import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int count = 0;

            while (num != 6174) {
                String numStr = String.format("%04d", num);
                char[] numArr = numStr.toCharArray();
                java.util.Arrays.sort(numArr);

                String minStr = new String(numArr);
                String maxStr = new StringBuilder(minStr).reverse().toString();

                int minNum = Integer.parseInt(minStr);
                int maxNum = Integer.parseInt(maxStr);

                num = maxNum - minNum;
                count++;
            }

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
