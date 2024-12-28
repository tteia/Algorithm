import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        StringTokenizer s0 = new StringTokenizer(line, "0");
        StringTokenizer s1 = new StringTokenizer(line, "1");

        bw.write(String.valueOf(Math.min(s0.countTokens(), s1.countTokens())));
        bw.flush();
        bw.close();
        br.close();
    }
}
