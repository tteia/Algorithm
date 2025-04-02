import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        char ch = input.charAt(0);
        
        int baseCode = 0xAC00;
        int chCode = ch - baseCode;
        
        int cho = chCode / (21 * 28);
        int jung = (chCode % (21 * 28)) / 28;
        int jong = chCode % 28;
        
        int result = cho * 21 * 28 + jung * 28 + jong + 1;
        
        System.out.println(result);
    }
}
