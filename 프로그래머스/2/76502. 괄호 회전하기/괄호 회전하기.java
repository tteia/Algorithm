import java.util.*;

class Solution {

    public int solution(String s) {
        int count = 0;

        Outter : for (int i = 0; i < s.length(); i++) {
            
            String rotated = s.substring(i) + s.substring(0, i);

            char first = rotated.charAt(0);
            char last = rotated.charAt(rotated.length() - 1);
            if (first == ')' || first == '}' || first == ']' ||
                last == '(' || last == '{' || last == '[') continue;

            Deque<Character> stack = new ArrayDeque<>();

            for (char c : rotated.toCharArray()) {
                switch (c) {
                    case '(': stack.addLast(')'); break;
                    case '[': stack.addLast(']'); break;
                    case '{': stack.addLast('}'); break;
                    default:
                        if (stack.isEmpty() || c != stack.pollLast()) continue Outter;
                }
            }

            if (stack.isEmpty()) count++;
        }

        return count;
    }
}