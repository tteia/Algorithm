import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int sum = 0;
        int[] nums = new int[N+1];
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;


        for (int i = 0; i < N; i++){
            nums[i] = sc.nextInt();
        }
        // 시작점과 끝점은 배열 안에 있어야 하니까!
        while(start <= N && end <= N){
            // 구간의 합이 S 보다 큰 경우를 찾는다 ! -> sum 이 S 보다 크거나,
            // start ~ end 까지의 길이가 end - start 보다 클 때.
            if(sum >= S && min > end - start){
                min = end - start;
            }

            if(sum < S){
                sum += nums[end++];
            }
            else {
                sum -= nums[start++];
            }
        }
        if (min == Integer.MAX_VALUE){
            System.out.println("0");
        }
        else{
            System.out.println(min);
        }
    }
}