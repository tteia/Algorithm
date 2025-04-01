class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n 의 약수를 모두 더한 값을 리턴하는 함수
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0) answer += i;
        }
        
        return answer;
    }
}