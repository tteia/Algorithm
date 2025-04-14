import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int money = K * N - M;
        if(money >= 0) System.out.print(money);
        else System.out.print(0);
        
    }
}