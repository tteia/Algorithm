import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean [] sticker = new boolean[N + 1];
        int current = 0;
        int maximum = 0;
        for (int i = 0; i < 2 * N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (!sticker[x]) {
                sticker[x] = true;
                current++;
                if (current > maximum) {
                    maximum = current;
                }
            } else {
                sticker[x] = false;
                current--;
            }
        }
        System.out.println(maximum);
    }
}
