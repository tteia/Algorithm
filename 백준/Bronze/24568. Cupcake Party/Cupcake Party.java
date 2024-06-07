import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int S = sc.nextInt();

        R *= 8;
        S *= 3;

        System.out.println((R+S)-28);
    }

}