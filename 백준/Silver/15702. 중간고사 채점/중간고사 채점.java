import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] scores = new int[N];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        
        int maxScore = -1;
        String bestStudent = "";
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String studentId = st.nextToken();
            int totalScore = 0;
            
            for (int j = 0; j < N; j++) {
                if (st.nextToken().equals("O")) {
                    totalScore += scores[j];
                }
            }
            
            if (totalScore > maxScore) {
                maxScore = totalScore;
                bestStudent = studentId;
            } else if (totalScore == maxScore) {
                if (Integer.parseInt(studentId) < Integer.parseInt(bestStudent)) {
                    bestStudent = studentId;
                }
            }
        }
        
        bw.write(bestStudent + " " + maxScore);
        bw.flush();
        bw.close();
    }
}
