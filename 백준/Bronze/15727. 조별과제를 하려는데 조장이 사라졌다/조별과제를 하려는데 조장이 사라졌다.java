import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        
        int time = L / 5;
        if (L % 5 != 0) {
            time++;
        }
        
        System.out.println(time);
    }
}
