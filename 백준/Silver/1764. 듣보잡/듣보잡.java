import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String number = br.readLine();
        StringTokenizer st = new StringTokenizer(number);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> s = new HashSet<>();
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < N; i++){
            s.add(br.readLine());
        }

        for(int i = 0; i < M; i++){
            String w = br.readLine();
            if(s.contains(w)){
                answer.add(w);
            }
        }

        Collections.sort(answer);

        sb.append(answer.size()).append("\n");
        for (String string : answer) {
            sb.append(string).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
