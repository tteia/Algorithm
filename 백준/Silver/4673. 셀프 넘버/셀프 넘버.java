import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] check = new boolean[10001];

        // d(n) 함수
        for (int i = 1; i <= 10000; i++) {
            int num = i;
            while (num <= 10000) {
                num = num + d(num);  // d(n) 계산
                if (num <= 10000) {
                    check[num] = true;
                }
            }
        }

        // 셀프 넘버 출력
        for (int i = 1; i <= 10000; i++) {
            if (!check[i]) {
                bw.append(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

    // 숫자의 각 자리수 합 계산 함수
    public static int d(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
