import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     int T = Integer.parseInt(br.readLine());
     StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            char first = s.charAt(0);

          String st = s.replace(first,'1');
            for (int j = 1; j < s.length(); j++) {
                char c = s.charAt(j);

                if(c == first) {
                   st = st.replace(s.charAt(j),'1');
                } else {
                   st = st.replace(s.charAt(j),'0');
                }
            }
            if (st.equals("1100100")) {
                sb.append("1").append('\n');
            } else {
                sb.append('0').append('\n');
            }
        }
        System.out.println(sb);
    }
}