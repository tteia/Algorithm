import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean containsSeven = String.valueOf(n).contains("7");
        boolean divisibleBySeven = n % 7 == 0;

        if (containsSeven && divisibleBySeven) {
            System.out.println(3);
        } else if (containsSeven) {
            System.out.println(2);
        } else if (divisibleBySeven) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
