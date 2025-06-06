import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int n = book_time.length;
        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] t = book_time[i];
            String[] s = t[0].split(":");
            int start = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
            String[] e = t[1].split(":");
            int end = Integer.parseInt(e[0]) * 60 + Integer.parseInt(e[1]) + 10;
            times[i][0] = start;
            times[i][1] = end;
        }
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int maxRooms = 0;
        for (int i = 0; i < n; i++) {
            int start = times[i][0];
            int end = times[i][1];
            if (!pq.isEmpty() && pq.peek() <= start) {
                pq.poll();
            }
            pq.offer(end);
            maxRooms = Math.max(maxRooms, pq.size());
        }
        return maxRooms;
    }
}
