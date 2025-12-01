import java.util.*;
class Solution {

    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int work : works){
            pq.add(work);
        }
        
        for (int i = 0; i < n && !pq.isEmpty(); i++) {
            int work = pq.poll() - 1;
            if (work > 0) pq.add(work);
        }

        long answer = 0L;

        while (!pq.isEmpty()) {
            long work = pq.poll();
            answer += work * work;
        }

        return answer;
    }

}