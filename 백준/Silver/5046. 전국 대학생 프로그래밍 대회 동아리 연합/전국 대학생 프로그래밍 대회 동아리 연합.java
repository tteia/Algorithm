import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[] p = new int[H];
        int[] a = new int[W];

        int min = B*2;
        int answer = 0;

        for (int i = 0; i < H; i++){
            p[i] = Integer.parseInt(br.readLine());
            String str = br.readLine();
            StringTokenizer tmp = new StringTokenizer(str);
            for (int j = 0; j < W; j++){
                a[j] = Integer.parseInt(tmp.nextToken());
                if(a[j] >= N && p[i] * N < min){
                    min = p[i] * N;
                    answer++;
                }
            }
        }

        if(answer != 0 && min <= B){
            bw.write(String.valueOf(min));
        }
        else
            bw.write("stay home");

        bw.flush();
        bw.close();
        br.close();
    }
}