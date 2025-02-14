import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int num = 666;
        
        while (true) {
            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
            if (cnt == N) {
                bw.write(String.valueOf(num));
                break;
            }
            num++;
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
