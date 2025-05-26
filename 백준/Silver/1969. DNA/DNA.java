import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // DNA 는 A, G, C, T 로 이루어짐
        // AGCAT GGAAT 는 0번 2번 인덱스가 다름 > Hamming Distance 2
        // M 길이의 N 개 DNA 중에서 HD 가 최소가 되는 기준 DNA 를 구하라
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] cnt = new int[M][4];
        String[] list = new String[N];

        for(int i = 0; i < N; i++){
            String dna = sc.next();
            list[i] = dna;
            for(int j = 0; j < M; j++){
                char nucle = dna.charAt(j);
                if(nucle == 'A') cnt[j][0]++;
                else if(nucle == 'C') cnt[j][1]++;
                else if(nucle == 'G') cnt[j][2]++;
                else if(nucle == 'T') cnt[j][3]++;
            }
        }

        String answer = getString(M, cnt);
        int diff = 0;
        for(String dna : list){
            for(int i = 0; i < M; i++){
                if(dna.charAt(i) != answer.charAt(i)) diff++;
            }
        }

        System.out.println(answer);
        System.out.println(diff);
    }

    private static String getString(int M, int[][] cnt) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            int max = 0;
            int nucle = 0;
            for(int j = 0; j < 4; j++){
                if(cnt[i][j] > max) {
                    max = cnt[i][j];
                    nucle = j;
                }
            }
            if(nucle == 0) sb.append('A');
            else if(nucle == 1) sb.append('C');
            else if(nucle == 2) sb.append('G');
            else sb.append('T');
        }
        return sb.toString();
    }
}