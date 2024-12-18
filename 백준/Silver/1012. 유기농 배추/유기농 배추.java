import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static int M;
    static int N;
    static int[][] cabbage;

    public static void dfs(int x, int y){
        visited[x][y] = true;
        for (int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && ny >= 0 && nx < M && ny < N){
                if(!visited[nx][ny] && cabbage[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 밭의 가로 길이
            N = Integer.parseInt(st.nextToken()); // 밭의 세로 길이
            int K = Integer.parseInt(st.nextToken()); // 심어진 배추 개수
            cabbage = new int[M][N];
            visited = new boolean[M][N];
            for(int j = 0; j < K; j++){
                StringTokenizer str = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(str.nextToken());
                int y = Integer.parseInt(str.nextToken());
                cabbage[x][y] = 1;
            }
            int worm = 0;
            for(int x = 0; x < M; x++){
                for(int y = 0; y < N; y++){
                    if(cabbage[x][y] == 1 && !visited[x][y]){
                        dfs(x, y);
                        worm++;
                    }
                }
            }
            bw.write(String.valueOf(worm));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
