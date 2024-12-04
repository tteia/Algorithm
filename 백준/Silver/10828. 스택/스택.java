import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            if(s.charAt(1) == 'u'){
                StringTokenizer str = new StringTokenizer(s);
                str.nextToken();
                int num = Integer.parseInt(str.nextToken());
                stack.push(num);
                continue;
            }
            else if(s.equals("pop")){
                if(stack.empty()){
                    sb.append(-1);
                }
                else sb.append(stack.pop());
            }
            else if(s.equals("size")){
                sb.append(stack.size());
            }
            else if(s.equals("empty")){
                if(stack.empty()){
                    sb.append(1);
                }
                else sb.append(0);
            }
            else if(s.equals("top")){
                if(stack.empty()){
                    sb.append(-1);
                }
                else sb.append(stack.peek());
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
