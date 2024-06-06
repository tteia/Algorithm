import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String N = sc.nextLine();
            int sum = 0;
            if(N.equals("#")){
                break;
            }
            for(int i = 0; i < N.length(); i++){
                if(N.charAt(i) == 'a' || N.charAt(i) == 'e' || N.charAt(i) == 'i' || N.charAt(i) == 'o' || N.charAt(i) == 'u' || N.charAt(i) == 'A' || N.charAt(i) == 'E' || N.charAt(i) == 'I' || N.charAt(i) == 'O' || N.charAt(i) == 'U'){
                    sum += 1;
                }
            }
            System.out.println(sum);
        }
    }
}