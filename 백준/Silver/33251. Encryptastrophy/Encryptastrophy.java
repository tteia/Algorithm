import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String cipher = sc.nextLine();
        char lastChar = sc.nextLine().charAt(0);
        int[] p = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = cipher.charAt(i) - 'a';
        }
        p[n - 1] = lastChar - 'a';
        for (int i = n - 1; i >= 1; i--) {
            p[i - 1] = (c[i] - p[i] + 26) % 26;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append((char) (p[i] + 'a'));
        }
        System.out.println(sb.toString());
    }
}
