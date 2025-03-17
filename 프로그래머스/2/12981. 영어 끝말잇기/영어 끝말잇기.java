import java.io.*;
import java.util.*;

class Solution {
    public boolean check(int idx, String[] words){
        for(int i = 0; i < idx; i++){
            if(words[idx].equals(words[i])) return true;
        }
        return false;
    }
    
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        for(int i = 1; i < words.length; i++){
            String now = words[i];
            String before = words[i - 1];
            if(now.charAt(0) == before.charAt(before.length() - 1)
              && !check(i, words)) continue;
            else{
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }
        return answer;
    }
}
