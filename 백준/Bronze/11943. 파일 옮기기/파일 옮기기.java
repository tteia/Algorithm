import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int first = A + D;
        int second = C + B;
        if(first > second){
            System.out.println(second);
        }
        else{
            System.out.println(first);
        }
    }

}