import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] names = new String[N];
        
        for (int i = 0; i < N; i++) {
            names[i] = br.readLine();
        }
        
        boolean increasing = true;
        boolean decreasing = true;
        
        for (int i = 0; i < N - 1; i++) {
            if (names[i].compareTo(names[i + 1]) > 0) {
                increasing = false;
            }
            if (names[i].compareTo(names[i + 1]) < 0) {
                decreasing = false;
            }
        }
        
        if (increasing) {
            bw.write("INCREASING\n");
        } else if (decreasing) {
            bw.write("DECREASING\n");
        } else {
            bw.write("NEITHER\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}
