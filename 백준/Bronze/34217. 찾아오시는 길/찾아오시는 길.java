import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int A = sc.nextInt(); // 출발지에서 한양대역까지의 시간
        int B = sc.nextInt(); // 출발지에서 용답역까지의 시간
        int C = sc.nextInt(); // 한양대역에서 ITBT관까지의 시간
        int D = sc.nextInt(); // 용답역에서 ITBT관까지의 시간
        
        // 각 경로의 총 소요 시간 계산
        int hanyangTime = A + C; // 한양대역 경로
        int yongdapTime = B + D; // 용답역 경로
        
        // 결과 출력
        if (hanyangTime < yongdapTime) {
            System.out.println("Hanyang Univ.");
        } else if (yongdapTime < hanyangTime) {
            System.out.println("Yongdap");
        } else {
            System.out.println("Either");
        }
        
        sc.close();
    }
}