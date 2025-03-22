import java.util.*;

class Solution {
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    public int solution(int[] arr) {
        int len = arr.length;
        
        int answer = arr[0];
        
        for (int i = 1; i < len; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
}
