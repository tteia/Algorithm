import java.io.*;
import java.util.*;

public class Main {
    static int N, M, V;
    static int[][] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i = 0; i < M; i++){
            StringTokenizer node = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(node.nextToken());
            int b = Integer.parseInt(node.nextToken());

            // a 와 b 사이가 이어져있음을 나타내는 1
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(V);
        sb.append("\n");
        check = new boolean[N+1];
        bfs(V);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int start){
        check[start] = true;
        sb.append(start).append(" ");

        for(int i = 0; i <= N; i++){
            if(arr[start][i] == 1 && !check[i]) dfs(i);
        }
    }

    public static void bfs(int start){
        queue.add(start);
        check[start] = true;

        while (!queue.isEmpty()){
            start = queue.poll();
            sb.append(start).append(" ");
            for(int i = 0; i <= N; i++){
                if(arr[start][i] == 1 && !check[i]){
                    queue.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
