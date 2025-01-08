import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long S = Long.parseLong(br.readLine()); 
        long sum = 0;
        int cnt = 0;
        
        for(int i = 1; sum + i <= S; i++){
            sum += i;
            cnt++;
        }

        bw.write(String.valueOf(cnt)); 
        bw.flush();
        bw.close();
        br.close();
    }
}
