import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double tmp = Math.pow(2, N);
        int answer = (int) tmp;


        System.out.println(answer);
    }
}