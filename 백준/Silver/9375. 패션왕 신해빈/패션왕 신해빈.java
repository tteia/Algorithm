import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> closet = new HashMap<>();
            for(int j = 0; j < n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();
                if(closet.containsKey(kind))
                    closet.put(kind, closet.get(kind) + 1);
                else closet.put(kind, 1);
            }
            int result = 1;
            for (Integer value : closet.values()) {
                result *= (value + 1);
            }
            bw.write(String.valueOf(result-1));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
