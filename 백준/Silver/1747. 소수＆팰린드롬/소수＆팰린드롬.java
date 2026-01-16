import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 10_000_001;
    static boolean[] isPrime = new boolean[MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sieveOfEratosthenes();

        while (true) {
            if (isPrime[N] && isPalindrome(N)) {
                System.out.println(N);
                break;
            }
            N ++;
        }
    }

    static boolean isPalindrome(int number) {
        String[] split = String.valueOf(number).split("");
        int s = 0;
        int e = split.length - 1;
        while (s < e) {
            if (!split[s].equals(split[e])) {
                return false;
            }
            s ++;
            e --;
        }
        return true;
    }

    static void sieveOfEratosthenes() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}