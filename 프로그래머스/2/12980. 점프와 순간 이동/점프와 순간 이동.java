import java.util.*;

class Solution {

    public int solution(int n) {
        int power = 0;

        while (n > 0) {
            if (n % 2 == 0) n /= 2;   // 짝수면 순간이동 (건전지 소모 X)
            else {
                n--;                 // 홀수면 점프 (건전지 소모 1)
                power++;
            }
        }

        return power;
    }

}