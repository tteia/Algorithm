import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int strLength = str.length();

        int N = Integer.parseInt(str);
        int result = 0;

        for(int i = (N - (strLength * 9)); i < N; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == N) {
                result = i;
                break;
            }

        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

}