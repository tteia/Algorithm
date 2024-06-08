import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int diff = sc.nextInt();
        int x, y;

        if(sum < diff || (sum + diff) % 2 != 0){
            System.out.println("-1");
        }
        else{
            x = (sum + diff) / 2;
            y = (sum - diff) / 2;

            if(x < y){
                int tmp = x;
                x = y;
                y = tmp;
            }
            if(x+y == sum && x-y == diff){
                System.out.println(x+" "+y);
            }
            else{
                System.out.println("-1");
            }
        }



    }
}