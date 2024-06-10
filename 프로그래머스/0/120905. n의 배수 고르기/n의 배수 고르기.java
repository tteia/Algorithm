import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
         List<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                tmp.add(numlist[i]);
            }
        }
        int[] answer = new int[tmp.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}