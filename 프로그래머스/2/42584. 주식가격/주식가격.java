import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peekLast()] > prices[i]){
                int idx = stack.pollLast();
                answer[idx] = i - idx;
            }
            
            stack.addLast(i);
            
        }
        
        while(!stack.isEmpty()){
            int idx = stack.poll();
            answer[idx] = prices.length - idx - 1;
        }
        
        return answer;
    }
}