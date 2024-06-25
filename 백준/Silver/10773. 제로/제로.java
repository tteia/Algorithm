import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < K; i++){
            int n = sc.nextInt();
            if(n == 0){
                stack.pop();
            }
            else stack.add(n);
        }

        for (Integer i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}