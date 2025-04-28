import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int V = n / 5;
        int I = n % 5;
        
        for(int i = 0; i < V; i++){
            System.out.print("V");
        }
        for(int i = 0; i < I; i++){
            System.out.print("I");
        }
    }
}