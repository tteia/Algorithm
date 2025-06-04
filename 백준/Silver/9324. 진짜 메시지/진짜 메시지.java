import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String message = br.readLine();
            Map<Character, Integer> check = new HashMap<>();
            boolean ok = true;
            for (int j = 0; j < message.length(); j++) {
                char c = message.charAt(j);
                check.put(c, check.getOrDefault(c, 0) + 1);
                if (check.get(c) == 3) {
                    if (j + 1 < message.length() && message.charAt(j + 1) == c) {
                        j++;
                        check.put(c, 0);
                    } else {
                        ok = false;
                        break;
                    }
                }
            }
            System.out.println(ok ? "OK" : "FAKE");
        }
    }
}
