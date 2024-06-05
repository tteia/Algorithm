import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] price = new int[5];
        int hamb = 2000;
        int drink = 2000;
        for(int i = 0; i < 3; i++){
            price[i] = sc.nextInt();
            if(price[i] < hamb){
                hamb = price[i];
            }
        }
        for(int i = 3; i < 5; i++){
            price[i] = sc.nextInt();
            if(price[i] < drink){
                drink = price[i];
            }
        }
        System.out.println((hamb + drink) - 50);

        
    }
}