class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int free = 0;
        
        // N * 12000 , k * 2000, 10인분 먹으면 음료 하나 공짜
        if((n / 10) >= 1){
            free = (n / 10) * 2000;
        }
        
        answer = (n * 12000 + k * 2000 - free);
        
        return answer;
    }
}