import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){
            int N = sc.nextInt();
            long S = sc.nextLong();
            long x = S / (N + 1);
            System.out.println(x);
            
        }
    }
}