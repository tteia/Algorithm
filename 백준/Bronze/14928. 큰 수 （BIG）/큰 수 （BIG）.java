import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        long mod = 20000303;
        long result = 0;
        
        for (int i = 0; i < N.length(); i++) {
            result = (result * 10 + (N.charAt(i) - '0')) % mod;
        }
        
        System.out.println(result);
    }
}
