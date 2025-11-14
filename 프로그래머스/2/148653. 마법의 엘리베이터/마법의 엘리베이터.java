class Solution {
    public int solution(int storey) {
        int cnt = 0;
        
        while (storey != 0) {
            int n = storey % 10;
            storey /= 10;

            if (n == 0) continue;

            else if (n < 5) {
                cnt += n;
            }
            else if (n > 5) {
                cnt += 10 - n;
                storey++;
            }
            else {
                cnt += 5;
                if (storey % 10 >= 5) storey++;
            }
        }

        return cnt;
    }
}