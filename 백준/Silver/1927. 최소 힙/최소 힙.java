import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(pq.isEmpty()){
                    bw.write("0");
                }
                else bw.write(String.valueOf(pq.poll()));
                bw.newLine();
            }
            else pq.add(x);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
