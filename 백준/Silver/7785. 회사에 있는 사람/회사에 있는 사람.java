import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> gigle = new HashSet<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter")){
                gigle.add(name);
            }
            else{
                gigle.remove(name);
            }
        }

        List<String> result = new ArrayList<>(gigle);
        Collections.sort(result, (s1, s2) -> s2.compareTo(s1));

        StringBuilder sb = new StringBuilder();

        for (String s : result) {
            sb.append(s + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
