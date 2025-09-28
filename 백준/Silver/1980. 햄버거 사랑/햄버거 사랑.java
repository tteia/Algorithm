import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        if (n > m) {
            int tmp = n;
            n = m;
            m = tmp;
        }

        int maxBurger = 0;
        int minCola = t;

        for (int i = 0; i <= t / m; i++) {
            int time = t - i * m;
            int burger = i + time / n;
            int cola = time % n;
            if (cola < minCola || (cola == minCola && burger > maxBurger)) {
                minCola = cola;
                maxBurger = burger;
            }
        }

        System.out.println(maxBurger + " " + minCola);
    }
}
