import java.io.*;
import java.util.*;

public class Main {
    public static String function(Long x,
                                  Long a,
                                  Long b,
                                  Long c,
                                  Long d){
        if(((a*x)+b) == ((c*x)+d)){
            return "Yes";
        }
        else
            return "No";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long x = Long.parseLong(br.readLine());
        String line = br.readLine();
        StringTokenizer tmp = new StringTokenizer(line);
        Long a = Long.parseLong(tmp.nextToken());
        Long b = Long.parseLong(tmp.nextToken());
        Long c = Long.parseLong(tmp.nextToken());
        Long d = Long.parseLong(tmp.nextToken());

        String answer = function(x, a, b, c, d);
        if(answer.equals("Yes")){
            Long value = (a*x)+b;
            bw.write(answer + " " + value);
        }
        else
            bw.write(answer);

        bw.flush();
        bw.close();
        br.close();
    }
}
