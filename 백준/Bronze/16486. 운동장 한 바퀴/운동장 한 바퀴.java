import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        double answer = (d2 * 3.141592 * 2) + (d1 * 2);
        System.out.println(answer);
    }
}