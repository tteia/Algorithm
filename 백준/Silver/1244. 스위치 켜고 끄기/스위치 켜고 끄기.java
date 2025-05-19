import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 스위치 개수 N 개
        int[] states = new int[N + 1]; // 각 스위치의 상태
        // 켜지면 1 꺼지면 0
        for(int i = 1; i <= N; i++){
            states[i] = sc.nextInt();
        }
        // 학생 수
        int students = sc.nextInt();

        for(int i = 0; i < students; i++){
            // 학생의 성별
            int gender = sc.nextInt();
            // 학생이 받은 스위치의 넘버
            int number = sc.nextInt();
            // 남학생: 스위치 번호가 자기가 받은 수의 배수이면 스위치 상태를 바꿈
            //   => 3 받았다면 3, 6 스위치 바꿈
            // 여학생: 구간을 찾아 해당 구간의 스위치 상태를 모두 바꿈 (구간에 속한 스위치는 항상 홀수)
            if(gender == 1){
                for(int j = number; j < states.length; j += number){
                    if(states[j] == 0) states[j] = 1;
                    else states[j] = 0;
                }
            }
            else {
                int left = number - 1;
                int right = number + 1;
                while(left > 0 && right <= N){
                    if(states[left] != states[right]) break;
                    left --;
                    right ++;
                }
                for(int j = left + 1; j < right; j++){
                    if(states[j] == 0) states[j] = 1;
                    else states[j] = 0;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++){
            sb.append(states[i]).append(" ");
            if(i % 20 == 0) sb.append("\n");
        }
        System.out.println(sb);
    }
}
