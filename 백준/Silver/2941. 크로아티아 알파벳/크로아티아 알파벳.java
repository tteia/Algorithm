import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int cnt = 0;

        for(int i = 0; i < line.length(); i++){
            cnt++;
            if(line.charAt(i) == '=' && i >= 1){
                if(line.charAt(i - 1) == 'c' || line.charAt(i - 1) == 's'){
                    cnt--;
                } else if (line.charAt(i - 1) == 'z'){
                    if(i >= 2 && line.charAt(i - 2) == 'd'){
                        cnt--;
                        cnt--;
                    } else if ((i >= 2 && line.charAt(i - 2) != 'd') || i >= 1 && line.charAt(i - 1) == 'z') {
                        cnt--;
                    }
                }
            } else if (line.charAt(i) == '-' && i >= 1) {
                if(line.charAt(i - 1) == 'c' || line.charAt(i - 1) == 'd'){
                    cnt--;
                }
            } else if (line.charAt(i) == 'j' && i >= 1) {
                if(line.charAt(i - 1) == 'l' || line.charAt(i - 1) == 'n'){
                    cnt --;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
