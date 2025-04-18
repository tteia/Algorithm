import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 1; i < 6; i++){
            int sock = sc.nextInt();
            arr[sock]++;
        }

        int answer = 0;

        for(int i = 0; i < 10; i++){
            if(arr[i] != 0 && arr[i] % 2 != 0) answer = i;
        }
        System.out.print(answer);
    }
}