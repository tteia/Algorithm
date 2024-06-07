import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if (M == 2 && D == 18){
            System.out.println("Special");
        }
        else if (M < 2){
            System.out.println("Before");
        }
        else if (M == 2 && D < 18){
            System.out.println("Before");
        }
        else if (M > 2){
            System.out.println("After");
        }
        else if (M == 2 && D > 18){
            System.out.println("After");
        }
    }

}