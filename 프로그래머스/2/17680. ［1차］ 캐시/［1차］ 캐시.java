import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0) return cities.length * 5;
        
        Queue<String> queue = new LinkedList<>();
        queue.add(cities[0].toLowerCase());
        answer += 5;
        
        for(int i = 1; i < cities.length; i++){
            String city = cities[i].toLowerCase();
            if(queue.contains(city)) {
                answer++;
                queue.remove(city);
                queue.add(city);
            }
            else{
                if(queue.size() >= cacheSize) queue.poll();
                answer += 5;
                queue.add(city);
            }
        }
        return answer;
    }
}