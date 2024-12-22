import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            boolean groupCheck = true;
            boolean[] visited = new boolean[26];

            for(int j = 0; j < line.length(); j++) {
                int currentChar = line.charAt(j) - 'a';
                if(j > 0 && line.charAt(j) != line.charAt(j - 1) && visited[currentChar]) {
                    groupCheck = false;
                    break;
                }
                visited[currentChar] = true;
            }

            if(groupCheck) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
