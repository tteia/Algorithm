import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(sc.nextLine());

            String[] names = new String[N];
            int[] x = new int[N];
            int[] y = new int[N];
            int[] r = new int[N];
            int[] allies = new int[N];

            for (int i = 0; i < N; i++) {
                String[] parts = sc.nextLine().split(" ");
                names[i] = parts[0];
                x[i] = Integer.parseInt(parts[1]);
                y[i] = Integer.parseInt(parts[2]);
                r[i] = Integer.parseInt(parts[3]);
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i != j) {
                        int dx = x[i] - x[j];
                        int dy = y[i] - y[j];
                        int distSq = dx * dx + dy * dy;
                        int radSum = r[i] + r[j];
                        if (distSq < radSum * radSum) {
                            allies[i]++;
                        }
                    }
                }
            }

            int maxAllies = -1;
            int winnerIndex = -1;
            boolean tie = false;

            for (int i = 0; i < N; i++) {
                if (allies[i] > maxAllies) {
                    maxAllies = allies[i];
                    winnerIndex = i;
                    tie = false;
                } else if (allies[i] == maxAllies) {
                    tie = true;
                }
            }

            if (tie) {
                System.out.println("TIE");
            } else {
                System.out.println(names[winnerIndex]);
            }
        }
    }
}
