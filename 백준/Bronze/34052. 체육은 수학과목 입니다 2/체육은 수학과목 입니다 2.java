import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        for(int i = 0; i < 4; i++){
            int t = Integer.parseInt(br.readLine());
            sum += t;
        }
        
        sum += 300;
        
        if(sum > 1800) System.out.print("No");
        else System.out.print("Yes");
    }
}