import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> tmp = new Stack<>();
        
        for (int i : arr) {
            if (tmp.isEmpty() || tmp.peek() != i) {
                tmp.push(i);
            }
        }
        
        int[] answer = new int[tmp.size()];
        
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = tmp.pop();
        }

        return answer;
    }
}