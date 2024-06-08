import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h, m, s;
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();

            h = d - a;
            m = e - b;
            s = f - c;
            if (m < 0) {
                if (s > 0) {
                    m = 60 + m;
                    h = h - 1;
                } else {
                    s = 60 + s;
                    m = 60 + m - 1;
                    h = h - 1;
                }
            } else {
                if (s < 0) {
                    s = 60 + s;
                    m = m - 1;
                    if (m < 0) {
                        m = 60 + m;
                        h = h - 1;
                    }
                }
            }
            System.out.println(h + " " + m + " " + s);
        }
    }
}