import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(!pq.isEmpty())
                    bw.write(String.valueOf(pq.poll()));
                else bw.write("0");
                bw.newLine();
            }
            else{
                pq.add(x);
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
