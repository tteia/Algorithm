import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        // 매일 다른 옷을 조합해서 입는 것을 좋아함
        // 각 종류별로 최대 한 가지 의상
        // 하루에 한 가지 이상 입어야 함. 나올 수 있는 조합의 수.
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            String category = clothes[i][1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }
        
        for(int cnt : map.values()){
            answer *= cnt + 1;
        }
        
        return answer - 1;
    }
}