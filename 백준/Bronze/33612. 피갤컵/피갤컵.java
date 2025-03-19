import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int year = 2024;
        int month = 8;
        
        month += (N - 1) * 7;
        
        year += (month - 1) / 12;
        month = (month - 1) % 12 + 1;
        
        System.out.print(year + " " + month);
    }
}
