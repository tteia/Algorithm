import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> counts = new ArrayList<>(map.values());
        counts.sort((a, b) -> b - a);
        
        int box = 0;
        int answer = 0;
        
        for (int count : counts) {
            box += count;
            answer++;
            if (box >= k) {
                break;
            }
        }
        
        return answer;
    }
}
