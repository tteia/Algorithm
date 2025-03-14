import java.util.*;

class Solution
{
    public int solution(String s)
    {   
        Stack<Character> stack = new Stack<>();
        for(char now : s.toCharArray()){
            if(!stack.isEmpty() && now == stack.peek()){
                stack.pop();
            }
            else stack.push(now);
        }
        
        return stack.size() > 0 ? 0 : 1;
        
    }
}