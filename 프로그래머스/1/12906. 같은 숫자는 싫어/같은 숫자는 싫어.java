import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Stack<Integer> tmp = new Stack<Integer>();
        for(int i : arr){
            tmp.push(i);
            if(tmp.size() > 1){                
                int before = tmp.pop();         
                int after = tmp.pop();          
                if(before == after){            
                    tmp.push(after);           
                }
                else{                           
                    tmp.push(after);           
                    tmp.push(before);
                }
            }
        }

        int[] answer = new int[tmp.size()];
        
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = tmp.pop();
        }

        return answer;
    }
}