import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<Integer, Integer> status = new HashMap<>();
        int missing = 0;

        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            int action = sc.nextInt();

            if (action == 1) {
                if (status.getOrDefault(id, 0) == 1) {
                    missing++;
                }
                status.put(id, 1);
            } else {
                if (status.getOrDefault(id, 0) == 0) {
                    missing++;
                } else {
                    status.put(id, 0);
                }
            }
        }

        for (int val : status.values()) {
            if (val == 1) {
                missing++;
            }
        }

        System.out.println(missing);
    }
}
