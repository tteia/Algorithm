import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] zebras = new int[N];
        int max = 0;

        for(int i = 0; i < N; i++) {
            String lines = sc.next();
            int count = 0;
            for(int j = 0; j < lines.length() - 1; j++) {
                if(lines.charAt(j) == '1' && lines.charAt(j + 1) == '0') {
                    count++;
                }
            }
            if(lines.charAt(lines.length() - 1) == '1') {
                count++;
            }
            zebras[i] = count;
            max = Math.max(max, zebras[i]);
        }

        int countZebra = 0;
        for(int i = 0; i < N; i++) {
            if(zebras[i] == max) {
                countZebra++;
            }
        }
        System.out.println(max + " " + countZebra);
    }
}
