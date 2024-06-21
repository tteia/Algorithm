import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        Queue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[score.length];
        int cnt = 0;

        for(int a : score){
            pq.add(a);
            if(pq.size() > k){
                pq.poll();
            }
            answer[cnt] = pq.peek();
            cnt++;
        }
        return answer;
    }
}