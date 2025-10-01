import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        int maxLen = 0;

        for (int len = n; len >= 2; len--) {
            if (len % 2 != 0) continue;
            for (int i = 0; i + len <= n; i++) {
                String sub = S.substring(i, i + len);
                int half = len / 2;
                int left = 0, right = 0;
                for (int j = 0; j < half; j++) {
                    left += sub.charAt(j) - '0';
                }
                for (int j = half; j < len; j++) {
                    right += sub.charAt(j) - '0';
                }
                if (left == right) {
                    maxLen = len;
                    break;
                }
            }
            if (maxLen > 0) break;
        }

        System.out.println(maxLen);
    }
}
