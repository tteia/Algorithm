import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        int current = 1;
        for (int i = 0; i < C; i++) {
            int N = Integer.parseInt(br.readLine());

            while (current <= N) {
                st.push(current++);
                sb.append("+\n");
            }

            if (!st.isEmpty() && st.peek() == N) {
                st.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.print(sb.toString());
    }
}
