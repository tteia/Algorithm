import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int A = B / 11 * 10;

        System.out.print(A);
    }
}