import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N];
        double M = 0;
        double sum = 0;
        for(int i = 0; i < N; i++){
            score[i] = sc.nextDouble();
            if(M < score[i]){
                M = score[i];
            }
        }
        for(int i = 0; i < N; i++){
            score[i] = score[i] / M * 100;
            sum += score[i];
        }
        System.out.println(sum / N);
    }
}