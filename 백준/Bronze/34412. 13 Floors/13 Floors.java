import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 13) {
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
    }
}
