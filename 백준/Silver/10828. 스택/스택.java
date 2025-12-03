import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            String comm = str.nextToken();
            if (comm.equals("push")) {
                stack.push(Integer.parseInt(str.nextToken()));
            } else {
                switch (comm) {
                    case "pop": 
                        if (stack.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            System.out.println(stack.pop());
                        }
                        break;
                    case "size": 
                        System.out.println(stack.size());
                        break;
                    case "empty": 
                        if (stack.isEmpty()) {
                            System.out.println(1);
                        } else {
                            System.out.println(0);
                        }
                        break;
                    case "top": 
                        if (stack.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            System.out.println(stack.peek());
                        }
                        break;
                }
            }
        }
    }
}
