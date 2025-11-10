class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 7조각의 피자 > n명이 나눠먹을 때 몇 판 필요?
        if(n % 7 == 0) answer = n / 7;
        else {
            answer = (n / 7) + 1;
        }
        
        return answer;
    }
}