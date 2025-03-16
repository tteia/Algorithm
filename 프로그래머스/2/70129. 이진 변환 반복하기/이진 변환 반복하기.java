import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zCnt = 0;

        while(!s.equals("1")){
            int zeroCount = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    zeroCount++;
                }
            }
            zCnt += zeroCount;
            s = Integer.toBinaryString(s.length() - zeroCount);
            cnt++;
        }

        answer[0] = cnt;
        answer[1] = zCnt;
        return answer;
    }
}
