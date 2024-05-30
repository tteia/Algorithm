import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        for(int i = 0; i < N; i++){
            answer += A[i] * B[N - 1 - i];
        }
        System.out.println(answer);
    }

}
