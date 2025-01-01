import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String answer = "";
        outerLoop:
        for(int i = 0; i < 15; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                String token = st.nextToken();
                if(token.equals("w")){
                    answer = "chunbae";
                    break outerLoop;
                }
                if(token.equals("b")){
                    answer = "nabi";
                    break outerLoop;
                }
                if(token.equals("g")){
                    answer = "yeongcheol";
                    break outerLoop;
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
