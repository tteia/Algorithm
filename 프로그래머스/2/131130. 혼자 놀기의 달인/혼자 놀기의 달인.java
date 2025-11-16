import java.util.*;

class Solution {
    public int solution(int[] cards) {
        boolean[] visited = new boolean[cards.length];
        List<Integer> counts = new ArrayList<>(cards.length);

        for (int i = 0; i < cards.length; i++) {
            if (visited[i]) continue;

            int index = cards[i] - 1, count = 0;
            while (!visited[index]) {
                count++;
                visited[index] = true;
                index = cards[index] - 1;
            }
            counts.add(count);
        }
        counts.sort(Comparator.reverseOrder());
        return counts.size() < 2 ? 0 : counts.get(0) * counts.get(1);
    }
}