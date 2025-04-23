import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(H == 9) H = 0;
        else H -= 9;
        
        System.out.print((H * 60) + M);
    }
}