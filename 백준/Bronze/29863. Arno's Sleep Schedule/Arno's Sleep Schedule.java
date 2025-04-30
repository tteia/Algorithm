import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        int sleep = 0;
        
        if(S < W) sleep =  W - S;
        else sleep = (24 - S) + W;
        
        System.out.print(sleep);
    }
}