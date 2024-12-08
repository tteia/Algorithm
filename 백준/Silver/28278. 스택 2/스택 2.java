import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if (line.contains(" ")) {
                StringTokenizer str = new StringTokenizer(line);
                str.nextToken();
                stack.add(Integer.parseInt(str.nextToken()));
            } else {
                int num = Integer.parseInt(line);
                switch (num) {
                    case 2:
                        if (!stack.isEmpty()) {
                            bw.write(String.valueOf(stack.pop()));
                        } else bw.write("-1");
                        break;
                    case 3:
                        bw.write(String.valueOf(stack.size()));
                        break;
                    case 4:
                        if (!stack.isEmpty()) {
                            bw.write("0");
                        } else bw.write("1");
                        break;
                    case 5:
                        if (!stack.isEmpty()) {
                            bw.write(String.valueOf(stack.peek()));
                        } else bw.write("-1");
                        break;
                }
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
