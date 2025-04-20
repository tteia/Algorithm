import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int beer = sc.nextInt();
        int malt = sc.nextInt();
        int wine = sc.nextInt();
        int soda = sc.nextInt();
        int seltzer = sc.nextInt();
        int water = sc.nextInt();

        int refund = (beer + malt + wine + soda + seltzer + water) * 5;
        System.out.println(refund);
    }
}
