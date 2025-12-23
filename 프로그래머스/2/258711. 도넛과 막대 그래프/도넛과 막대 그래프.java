import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = {0, 0, 0, 0};

        // i,j 에서 i,j == i,j+1 이면 answer[1] ++;
        // 하나의 노드에 하나의 선만 들어오면 막대 그래프
        // 두 개 이상의 선이 들어온다 > 도넛그래프
        
        Map<Integer, Integer> outDegree = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();
        Set<Integer> nodes = new HashSet<>();
        
        for(int[] edge : edges){
            int from = edge[0];
            int to = edge[1];
            
            outDegree.put(from, outDegree.getOrDefault(from, 0) + 1);
            inDegree.put(to, inDegree.getOrDefault(to, 0) + 1);
            
            nodes.add(from);
            nodes.add(to);
        }
        
        int create = 0;
        int total =  0;
        
        for(int node : nodes){
            int out = outDegree.getOrDefault(node, 0);
            int in = inDegree.getOrDefault(node, 0);
            
            if(out >= 2 && in == 0){
                create = node;
                total = out;
                
                break;
            }
        }
        
        answer[0] = create;
        
        for(int node : nodes){
            if(node == create) continue;
            
            int out = outDegree.getOrDefault(node, 0);
            int in = inDegree.getOrDefault(node, 0);

            if(out == 0) answer[2]++;
            else if(out >= 2 && in >= 2) answer[3] ++;
        }
        
        answer[1] = total - answer[2] - answer[3];
        
        return answer;
    }
    
}