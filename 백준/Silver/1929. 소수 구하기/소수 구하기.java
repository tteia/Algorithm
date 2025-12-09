import java.util.*;

public class Main{
public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] num_lit = new boolean[n + 1];
        Arrays.fill(num_lit, false);

        num_lit[0] = true; 
        num_lit[1] = true; 

        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(num_lit[i]) 
                continue;
            for (int j = i + i; j <= n; j+=i) {
                num_lit[j] = true;
            }
        }
        for (int i = m; i <= n; i++) {
            if(!num_lit[i])
                System.out.println(i);
        }
    }
}