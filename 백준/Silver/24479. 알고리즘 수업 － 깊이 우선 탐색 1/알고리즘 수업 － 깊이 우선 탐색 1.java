import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int count = 0;
    static int[] visitedOrder;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // 깊이 우선 탐색(DFS) 메서드
    public static void dfs(int node) {
        if (visitedOrder[node] != 0) {
            return; // 이미 방문한 노드는 스킵
        }
        visitedOrder[node] = ++count; // 방문 순서 기록
        for (int nextNode : graph.get(node)) {
            dfs(nextNode);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 노드의 개수
        int m = sc.nextInt(); // 간선의 개수
        int r = sc.nextInt(); // 시작 노드
        visitedOrder = new int[n + 1];

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력 받아 그래프 구성
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 방문할 수 있는 노드가 여러 개인 경우, 노드 번호가 작은 것을 먼저 방문하기 위해 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        // DFS 실행
        dfs(r);

        // 각 노드의 방문 순서 출력
        for (int i = 1; i <= n; i++) {
            System.out.println(visitedOrder[i]);
        }
    }

}
