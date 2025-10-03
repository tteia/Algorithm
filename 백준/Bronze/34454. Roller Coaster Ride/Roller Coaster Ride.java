import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int P = sc.nextInt();
        int capacity = C * P;
        if (N <= capacity) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
