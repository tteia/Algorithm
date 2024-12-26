import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String str = String.valueOf(a);
        str += String.valueOf(b);
        int d = Integer.parseInt(str);

        bw.write(String.valueOf(a + b - c));
        bw.newLine();
        bw.write(String.valueOf(d - c));

        bw.flush();
        bw.close();
        br.close();
    }
}
