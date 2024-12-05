import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int a = 0;
        HashSet<Integer> S = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String tmp = br.readLine();
            StringTokenizer st = new StringTokenizer(tmp);
            String command = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }
            switch (command){
                case "add": {
                    S.add(num);
                    break;
                }
                case "remove": {
                    S.remove(num);
                    break;
                }
                case "check": {
                    int check = S.contains(num) ? 1 : 0;
                    bw.write(String.valueOf(check));
                    bw.newLine();
                    break;
                }
                case "toggle": {
                    boolean b = S.contains(num) ? S.remove(num) : S.add(num);
                    break;
                }
                case "all": {
                    S = new HashSet<>();
                    for(int j = 1; j < 21; j++){
                        S.add(j);
                    }
                    break;
                }
                case "empty": {
                    S = new HashSet<>();
                    break;
                }
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
