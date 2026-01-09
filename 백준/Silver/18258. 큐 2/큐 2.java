import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int Q = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push":
                    int A = Integer.parseInt(st.nextToken());
                    queue.add(A);
                    Q = A;
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n"); 
                    } else {
                        sb.append(queue.poll()).append("\n"); 
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        sb.append(-1).append("\n"); 
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(queue.peekLast()).append("\n");
                    }
                    break;
                default: break;
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}