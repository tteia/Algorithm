import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int startHeight = Integer.parseInt(br.readLine());
        int prevHeight = startHeight;
        int maxRise = 0;
        for (int i = 1; i < N; i++) {
            int h = Integer.parseInt(br.readLine());
            if (h > prevHeight) {
                int rise = h - startHeight;
                if (rise > maxRise) {
                    maxRise = rise;
                }
            } else {
                startHeight = h;
            }
            prevHeight = h;
        }
        System.out.println(maxRise);
    }
}
