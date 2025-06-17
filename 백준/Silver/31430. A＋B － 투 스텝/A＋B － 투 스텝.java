import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        if (T == 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
            long S = A + B;
            char[] arr = new char[13];
            for (int i = 12; i >= 0; i--) {
                int d = (int)(S % 26);
                arr[i] = (char)('a' + d);
                S /= 26;
            }
            System.out.println(new String(arr));
        } else if (T == 2) {
            String s = br.readLine();
            long S = 0;
            for (int i = 0; i < 13; i++) {
                int d = s.charAt(i) - 'a';
                S = S * 26 + d;
            }
            System.out.println(S);
        }
    }
}
