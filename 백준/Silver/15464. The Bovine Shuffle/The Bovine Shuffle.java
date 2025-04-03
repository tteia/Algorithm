import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int[] shuffleOrder = new int[N];
        for (int i = 0; i < N; i++) {
            shuffleOrder[i] = sc.nextInt() - 1;
        }
        sc.nextLine();

        long[] finalOrder = new long[N];
        for (int i = 0; i < N; i++) {
            finalOrder[i] = sc.nextLong();
        }

        long[] currentOrder = new long[N];
        System.arraycopy(finalOrder, 0, currentOrder, 0, N);

        for (int shuffle = 0; shuffle < 3; shuffle++) {
            long[] newOrder = new long[N];
            for (int i = 0; i < N; i++) {
                newOrder[i] = currentOrder[shuffleOrder[i]];
            }
            currentOrder = newOrder;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(currentOrder[i]);
        }
    }
}
