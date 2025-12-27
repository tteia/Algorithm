import java.util.*;
// A가 먼저 n/2 개의 주사위를 가져가면 B가 남은 주사위를 가져감
// 각각 굴린 뒤 나온 수를 모두 합 > 점수가 더 큰 쪽이 승리, 같으면 무승부
// A는 자신이 승리할 확률이 높아지도록 주사위를 가져가려고 함
// 확률을 따져봐야함
// a가 1, 2를 가져감 > b는 3, 4를 가져감
// a가 가질 수 있는 합을 저장한 배열 vs b가 가질 수 있는 합을 저장한 배열 비교
// 비교해서 a가 몇번 이길 수 있는지 세봄
// 그 다음 a 가 1, 3 을 가져감 > b 는 2, 4를 가져감
// 이 과정을 반복해서 a가 이길 수 있는 경우의 수가 제일 높은 수를 구하기
class Solution {
    int n;
    int[][] dice;
    int maxWin = 0;
    int[] answer;
    
    public int[] solution(int[][] dice) {
        this.n = dice.length;
        this.dice = dice;
        
        pickDice(0, 0, new ArrayList<>());
        
        return answer;
    }
    
    public void pickDice(int idx, int cnt, List<Integer> aDice){
        if(cnt == n / 2){
            List<Integer> bDice = new ArrayList<>();
            
            for(int i = 0; i < n; i++){
                if(!aDice.contains(i)) bDice.add(i);
            }
            
            List<Integer> aScores = getScores(aDice);
            List<Integer> bScores = getScores(bDice);
            
            Collections.sort(bScores);
            
            int win = 0;
            for(int a : aScores){
                win += binarySearch(bScores, a);
            }
            
            if(win > maxWin){
                maxWin = win;
                answer = new int[n / 2];
                for(int i = 0; i < n / 2; i++){
                    answer[i] = aDice.get(i) + 1;
                }
            }
            return;
        }
        
        if(idx == n) return;
        
        aDice.add(idx);
        pickDice(idx + 1, cnt + 1, aDice);
        aDice.remove(aDice.size() - 1);
        
        pickDice(idx + 1, cnt, aDice);
    }
    
    public int binarySearch(List<Integer> list, int target){
        int left = 0;
        int right = list.size();
        
        while(left < right){
            int mid = (left + right) / 2;
            if(list.get(mid) < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
    
    public List<Integer> getScores(List<Integer> diceList){
        List<Integer> scores = new ArrayList<>();
        scores.add(0);
        
        for(int idx : diceList){
            List<Integer> newScores = new ArrayList<>();
            
            for(int score : scores) {
                for(int i = 0; i < 6; i++){
                    newScores.add(score + dice[idx][i]);
                }
            }
            
            scores = newScores;
        }
        
        return scores;
    }
}