import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int I = sc.nextInt();
        int A = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[] arr = new int[2];
        arr[0] = H * I;
        arr[1] = A * R * C;

        int answer = arr[0] - arr[1];
        System.out.print(answer);
    }
}