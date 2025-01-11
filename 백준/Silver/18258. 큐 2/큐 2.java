import java.io.*;
import java.util.*;

public class Main {

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            if(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                queue.add(a);
                continue;
            }
            switch (line){
                case "pop":
                    if(queue.isEmpty()) bw.write("-1");
                    else bw.write(String.valueOf(queue.poll()));
                    bw.newLine();
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size()));
                    bw.newLine();
                    break;
                case "empty":
                    if(queue.isEmpty()) bw.write("1");
                    else bw.write("0");
                    bw.newLine();
                    break;
                case "front":
                    if(queue.isEmpty()) bw.write("-1");
                    else bw.write(String.valueOf(queue.peek()));
                    bw.newLine();
                    break;
                case "back":
                    if(queue.isEmpty()) bw.write("-1");
                    else bw.write(String.valueOf(queue.peekLast()));
                    bw.newLine();
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
