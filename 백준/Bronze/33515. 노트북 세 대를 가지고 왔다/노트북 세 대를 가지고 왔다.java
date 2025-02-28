import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T1 = Integer.parseInt(st.nextToken());
        int T2 = Integer.parseInt(st.nextToken());
        
        int maxTime = Math.min(T1, T2);
        
        bw.write(maxTime + "\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
