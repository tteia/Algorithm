import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> tmp = new PriorityQueue<>();
        for(int s : scoville){
            tmp.add(s);
        }
        if(tmp.peek() >= K){
            return 0;
        }
        
        int cnt = 0;
        while(tmp.peek() < K && tmp.size() > 1){
            int first = tmp.poll();
            int second = tmp.poll();
            tmp.add(first+(second * 2));
            cnt++;
        }
        if(tmp.peek() < K){
            answer = -1;
        }
        else answer = cnt;
        return answer;
    }
}