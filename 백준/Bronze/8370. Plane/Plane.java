import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int n1 = Integer.parseInt(input[0]);
        int k1 = Integer.parseInt(input[1]);
        int n2 = Integer.parseInt(input[2]);
        int k2 = Integer.parseInt(input[3]);
        
        int totalSeats = (n1 * k1) + (n2 * k2);
        
        bw.write(String.valueOf(totalSeats));
        bw.newLine();
        bw.flush();
        
        br.close();
        bw.close();
    }
}
