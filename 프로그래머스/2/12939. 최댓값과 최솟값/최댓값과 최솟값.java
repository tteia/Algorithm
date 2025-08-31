import java.util.*;

class Solution {
    public String solution(String s) {
        // s 에는 공백으로 구분된 숫자들이 저장되어 있음
        // 최소값과 절대값을 찾아 문자열을 반환하는 함수
        StringTokenizer st = new StringTokenizer(s);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(num > max) max = num;
            if(num < min) min = num;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        return String.valueOf(sb);
    }
}