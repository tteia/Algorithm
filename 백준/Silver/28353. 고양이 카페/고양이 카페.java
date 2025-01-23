import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] cats = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            cats[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cats);

        int start = 0;
        int end = N - 1;
        int cnt = 0;

        while(start < end){
            int tmp = cats[start] + cats[end];
            if(tmp > K){
                end--;
            } else if (tmp <= K) {
                cnt++;
                start++;
                end--;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
