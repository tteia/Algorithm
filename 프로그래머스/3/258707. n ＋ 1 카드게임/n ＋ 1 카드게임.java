import java.util.*;

class Solution {
    public int solution(int coin, int[] cards) {
        int n = cards.length;
        int target = n + 1;
        List<Integer> hand = new ArrayList<>();
        List<Integer> pending = new ArrayList<>();
        
        for(int i = 0; i < n / 3; i++){
            hand.add(cards[i]);
        }
        
        int round = 1;
        int idx = n / 3;
        
        while(idx < n){
            int card1 = cards[idx++];
            int card2 = cards[idx++];
            
            pending.add(card1);
            pending.add(card2);
            
            boolean check = false;
            
            for(int i = 0; i < hand.size(); i++){
                for(int j = i + 1; j < hand.size(); j++){
                    if(hand.get(i) + hand.get(j) == target){
                        hand.remove(j);
                        hand.remove(i);
                        check = true;
                        break;
                    }
                }
                if(check) break;
            }
            
            if(!check && coin >= 1){
                for(int i = 0; i < hand.size(); i++){
                    for(int j = 0; j < pending.size(); j++){
                        if(hand.get(i) + pending.get(j) == target){
                            hand.remove(i);
                            pending.remove(j);
                            coin--;
                            check = true;
                            break;
                        }
                    }
                    if(check) break;
                }
            }
            
            if(!check && coin >= 2){
                for(int i = 0; i < pending.size(); i++){
                    for(int j = i + 1; j < pending.size(); j++){
                        if(pending.get(i) + pending.get(j) == target){
                            pending.remove(j);
                            pending.remove(i);
                            coin -= 2;
                            check = true;
                            break;
                        }
                    }
                    if(check) break;
                }
            }
            
            if(check) round++;
            else break;
        }
        
        return round;
    }
}