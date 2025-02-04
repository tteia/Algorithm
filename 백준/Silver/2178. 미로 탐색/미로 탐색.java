import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer size = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(size.nextToken());
        int M = Integer.parseInt(size.nextToken());
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 시작 지점 큐에 넣기
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        arr[0][0] = 1;

        // BFS 탐색
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if (x == N - 1 && y == M - 1) {
                break;
            }

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 체크와 벽 체크, 방문 체크
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && arr[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    arr[nx][ny] = arr[x][y] + 1; // 현재 칸에서 +1 만큼 거리 증가
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        
        bw.write(String.valueOf(arr[N - 1][M - 1]));
        bw.flush();
        bw.close();
        br.close();
    }
}
