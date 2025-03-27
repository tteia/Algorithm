class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int cnt = Integer.bitCount(n);
        
        // 1. n 보다 큰 자연수
        // 2. n 과 n 은 2진수 변환 시 1의 갯수가 같다
        // 3. n 의 다음 큰 숫자는 1,2 충족하는 가장 작은 수
        
        while(Integer.bitCount(answer) != cnt){
            if(Integer.bitCount(answer) != cnt) answer++;
        }
        
        return answer;
    }
}