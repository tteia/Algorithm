import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N > 0 && M > 0) {
            sc.nextLine();
        }

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            String fish = sc.nextLine();
            StringBuilder sb = new StringBuilder(fish);
            String answer = sb.reverse().toString();
            arr[i] = answer;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}