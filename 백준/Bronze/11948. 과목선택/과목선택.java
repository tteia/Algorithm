import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] science = new int[4];
        int[] history = new int[2];
        int min = 100, sscore = 0, hscore = 0;
        for(int i = 0; i < 4; i++){
            science[i] = sc.nextInt();
            sscore += science[i];
            if(science[i] < min){
                min = science[i];
            }
        }
        sscore -= min;
        min = 100;
        for(int i = 0; i < 2; i++){
            history[i] = sc.nextInt();
            hscore += history[i];
            if(history[i] < min){
                min = history[i];
            }
        }
        hscore -= min;

        System.out.println(sscore + hscore);

    }
}