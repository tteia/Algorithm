import java.io.*;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(M * N));
        bw.flush();
        bw.close();
        br.close();
    }
}
