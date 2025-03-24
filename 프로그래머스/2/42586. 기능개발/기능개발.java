import java.util.*;

class Solution {    
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[100];
        int deployCount = 0;
        int deployDay = 0;
        
        int[] daysToComplete = new int[speeds.length];
        
        for(int i = 0; i < speeds.length; i++) {
            int day = (100 - progresses[i]) % speeds[i];
            if(day != 0) {
                daysToComplete[i] = (100 - progresses[i]) / speeds[i] + 1;
            } else {
                daysToComplete[i] = (100 - progresses[i]) / speeds[i];
            }
        }
        
        // 배포를 진행하는 로직
        for (int i = 0; i < daysToComplete.length; i++) {
            if (daysToComplete[i] > deployDay) {
                deployDay = daysToComplete[i];
                answer[deployCount++] = 1;
            } else {
                answer[deployCount - 1]++;
            }
        }
        
        int[] result = new int[deployCount];
        for (int i = 0; i < deployCount; i++) {
            result[i] = answer[i];
        }
        
        return result;
    }
}
