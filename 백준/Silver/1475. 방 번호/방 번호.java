import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        String input = sc.nextLine();
        for(int i = 0; i < input.length(); i++) {
            nums[input.charAt(i) - '0']++;
        }
        int answer  =0;
        int reverse = 0;

        for(int i = 0; i < 10; i++) {
            if(i == 6 || i == 9) {
                reverse+=nums[i];
            } else {
                answer = Math.max(answer, nums[i]);
            }
        }
        answer = Math.max(reverse/2 + reverse%2, answer);
        
        System.out.println(answer);
    }
}