import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        boolean[] visited = new boolean[N + 1];

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        int cnt = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            for (int i : graph[node]) {
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}