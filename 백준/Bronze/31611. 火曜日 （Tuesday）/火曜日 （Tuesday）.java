import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X % 7 == 2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
