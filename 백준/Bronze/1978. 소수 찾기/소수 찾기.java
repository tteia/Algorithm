import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        while (st.hasMoreTokens()){
            boolean check = false;
            int num = Integer.parseInt(st.nextToken());
            if(num == 1 || num == 0){
                continue;
            }
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    check = true;
                }
            }
            if(!check){
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
