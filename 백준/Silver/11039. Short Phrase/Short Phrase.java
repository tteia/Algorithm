import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String[] words = new String[n];
            int[] lengths = new int[n];
            for (int i = 0; i < n; i++) {
                words[i] = br.readLine();
                lengths[i] = words[i].length();
            }

            int[] pattern = {5, 7, 5, 7, 7};

            for (int i = 0; i < n; i++) {
                int idx = i;
                boolean valid = true;
                for (int p = 0; p < 5; p++) {
                    int target = pattern[p];
                    int sum = 0;
                    while (idx < n && sum < target) {
                        sum += lengths[idx];
                        idx++;
                    }
                    if (sum != target) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
