import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if(N % M == 0) System.out.print("Yes");
        else System.out.print("No");
    }
}