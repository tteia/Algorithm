import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int num = 0;

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            if(line.contains(" ")){
                StringTokenizer st = new StringTokenizer(line);
                st.nextToken();
                num = Integer.parseInt(st.nextToken());
                queue.add(num);
                continue;
            }
            switch (line){
                case "pop":
                    if(queue.isEmpty()){
                        bw.write("-1");
                    }
                    else bw.write(String.valueOf(queue.poll()));
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size()));
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        bw.write("1");
                    }
                    else bw.write("0");
                    break;
                case "front":
                    if(queue.isEmpty()){
                        bw.write("-1");
                    }
                    else bw.write(String.valueOf(queue.peek()));
                    break;
                case "back":
                    if(queue.isEmpty()){
                        bw.write("-1");
                    }
                    else bw.write(String.valueOf(num));
                    break;
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
