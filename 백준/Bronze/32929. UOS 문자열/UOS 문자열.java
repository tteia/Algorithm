import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = (N % 3);
        if(x == 1) System.out.print("U");
        if(x == 2) System.out.print("O");
        if(x == 0) System.out.print("S");
    }
}