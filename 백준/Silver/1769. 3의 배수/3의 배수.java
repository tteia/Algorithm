import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int count = 0;

        while (x.length() > 1) {
            int sum = 0;
            for (int i = 0; i < x.length(); i++) {
                sum += x.charAt(i) - '0';
            }
            x = String.valueOf(sum);
            count++;
        }

        System.out.println(count);
        int y = Integer.parseInt(x);
        if (y == 3 || y == 6 || y == 9) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
