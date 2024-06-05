import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = 0;
        if (a == b && b == c){
            System.out.println(10000 + (1000 * a));
        }
        else if (a != b && a != c && b != c){
            if (a > b && a > c){
                m = a;
            }
            else if (b > a && b > c){
                m = b;
            }
            else {
                m = c;
            }
            System.out.println(m * 100);
        }
        else if ((a==b) || (a==c) || (b==c)){
            if (a==b || a==c){
                m = a;
            }
            else if (b==c){
                m = b;
            }
            System.out.println(1000 + (m * 100));
        }
    }
}