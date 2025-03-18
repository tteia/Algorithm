import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        N %= 14;
        if (N == 0) N = 14;
        String line = "WelcomeToSMUPC";

        System.out.print(line.charAt(N-1));
    }
}
