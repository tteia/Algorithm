import java.io.*;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        for(int i = M; i <= N; i++){
            if(check(i) > 0 && i != 1) sb.append(i).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static int check(int num){
        int tmp = -1;
        double dnum = num;
        if(Math.sqrt(dnum)== Math.floor(Math.sqrt(dnum))) return tmp;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0 && i != num){
                return tmp;
            }
        }
        tmp = num;
        return tmp;
    }
}
