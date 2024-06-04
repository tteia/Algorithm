import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int sum = 0;
        int[] nums = new int[N];
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        for (int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }

        while (end <= N) {
            if (sum >= S) {
                min = Math.min(min, end - start);
                sum -= nums[start++];
            } else {
                if (end < N) {
                    sum += nums[end++];
                } else {
                    break; // end가 N 이상으로 증가하는 것을 방지하기 위해 루프 종료
                }
            }
        }
        
        if (min == Integer.MAX_VALUE){
            System.out.println("0");
        } else {
            System.out.println(min);
        }
    }
}
