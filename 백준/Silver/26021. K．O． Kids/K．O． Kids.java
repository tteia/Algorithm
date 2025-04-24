import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        boolean[] known = new boolean[n];
        char[] real = s.toCharArray();

        int count = 0;

        for (int i = 0; i < k; i++) {
            boolean success = true;
            char current = 'L';

            for (int j = 0; j < n; j++) {
                char step;
                if (known[j]) {
                    step = real[j];
                } else {
                    step = current;
                    if (step != real[j]) {
                        success = false;
                        real[j] = (current == 'L') ? 'R' : 'L';
                        known[j] = true;
                        break;
                    }
                    known[j] = true;
                }
                current = (step == 'L') ? 'R' : 'L';
            }

            if (success) count++;
        }

        System.out.println(count);
    }
}
