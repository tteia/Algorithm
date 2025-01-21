import java.io.*;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        N = Integer.parseInt(br.readLine());
        int start = 0;
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > start){
                for(int j = start + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = num;
            }
            else if(stack.peek() != num) {
                bw.write("NO");
                bw.flush();
                bw.close();
                br.close();
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
