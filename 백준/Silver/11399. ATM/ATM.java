import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());

        int[] pi = new int[N];
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            pi[i] = Integer.parseInt(input[i]);
        }
        System.out.println(sumTime(pi));
    }

    public static int sumTime(int[] pi) {
        int subsum = 0;
        int sum = 0;
        Arrays.sort(pi);

        for (int num : pi) {
            subsum += num;
            sum += subsum;
        }
        return sum;
    }
}