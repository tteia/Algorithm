import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= N; i++){
            String sen = sc.nextLine();
            System.out.println(i + ". " + sen);
        }
        
    }
}