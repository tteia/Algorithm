import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if(N == 1){
            bw.write("*");
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N * 2; j++){
                if((i+j)%2 == 0){
                    bw.write("*");
                }
                else bw.write(" ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
