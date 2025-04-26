import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int E = sc.nextInt();
        int H = sc.nextInt();
        
        if(E * 2 >= H) System.out.print("E");
        else System.out.print("H");
    }
}