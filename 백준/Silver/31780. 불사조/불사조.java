import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        List<Integer> power = new ArrayList<>();
        power.add(X);
        int sum = X;
        for (int i = 0; i < M; i++) {
            List<Integer> nextPower = new ArrayList<>();
            for (Integer p : power) {
                int floor = p / 2;
                int ceil = (p + 1) / 2;
                sum += floor;
                sum += ceil;
                nextPower.add(floor);
                nextPower.add(ceil);
            }
            power = nextPower;
        }
        
        // 결과 출력
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
