import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        Deque<Integer> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    pw.println(dq.isEmpty() ? -1 : dq.removeFirst());
                    break;
                case "pop_back":
                    pw.println(dq.isEmpty() ? -1 : dq.removeLast());
                    break;
                case "size":
                    pw.println(dq.size());
                    break;
                case "empty":
                    pw.println(dq.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    pw.println(dq.isEmpty() ? -1 : dq.peekFirst());
                    break;
                case "back":
                    pw.println(dq.isEmpty() ? -1 : dq.peekLast());
                    break;
            }
        }
        pw.flush();
    }
}
