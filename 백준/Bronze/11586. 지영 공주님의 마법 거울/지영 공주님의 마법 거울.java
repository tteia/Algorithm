import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] mirror = new String[N];
        for(int i = 0; i < N; i++){
            mirror[i] = br.readLine();
        }
        int K = Integer.parseInt(br.readLine());
        switch (K){
            case 1:
                for(int i = 0; i < N; i++){
                    bw.write(mirror[i]);
                    bw.newLine();
                }
                break;
            case 2:
                for(int i = 0; i < N; i++){
                    StringBuilder sb = new StringBuilder(mirror[i]);
                    bw.write(sb.reverse().toString());
                    bw.newLine();
                }
                break;
            case 3:
                for(int i = N - 1; i >= 0; i--){
                    bw.write(mirror[i]);
                    bw.newLine();
                }
                break;
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
