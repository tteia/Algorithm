import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> tmp = new HashMap<>();
        for(String p : participant){
            if(tmp.containsKey(p)){
                tmp.put(p, tmp.get(p)+1);
            }
            else{
                tmp.put(p, 1);
            }
        }
        for(String c : completion){
            if(tmp.containsKey(c)){
                tmp.put(c, tmp.get(c)+1);
            }
            else{
                tmp.put(c, 1);
            }
        }
        for(String p : participant){
            if(tmp.get(p) % 2 != 0){
                answer = p;
            }
        }
        return answer;
    }
}