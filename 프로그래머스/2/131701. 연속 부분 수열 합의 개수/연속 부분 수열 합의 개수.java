import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();

    public int solution(int[] elements) {
        for (int len = 1; len <= elements.length; len++) {
            for (int start = 0; start < elements.length; start++) {
                check(start, len, elements);
            }
        }

        return set.size();
    }

    private void check(int start, int len, int[] elements) {
        int sum = 0;
        int N = elements.length;

        for (int i = 0; i < len; i++) {
            sum += elements[(start + i) % N];
        }

        set.add(sum);
    }
}
