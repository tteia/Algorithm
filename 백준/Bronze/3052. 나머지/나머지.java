import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10]; // 크기가 10인 배열 선언
        HashSet<Integer> remainders = new HashSet<>(); // 서로 다른 나머지를 저장할 HashSet

        // 10개의 숫자를 입력받아 배열에 저장
        for(int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // 각 숫자를 42로 나눈 나머지를 HashSet에 추가
        for(int i = 0; i < 10; i++) {
            int remainder = numbers[i] % 42;
            remainders.add(remainder);
        }

        // 서로 다른 나머지의 개수를 출력
        System.out.println(remainders.size());
    }
}