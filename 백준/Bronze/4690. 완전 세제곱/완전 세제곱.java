import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int a = 1; a <= 100; a++){
            for(int b = 2; b < 100; b++){
                for(int c = 3; c < 100; c++){
                    for(int d = 4; d < 100; d++){
                        if(a * a * a == (b * b * b) + (c * c * c) + (d * d * d) && b < c && c < d){
                            bw.write("Cube = " + a + ", Triple = " + "(" + b + "," + c + "," + d + ")");
                            bw.newLine();
                        }
                    }
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
