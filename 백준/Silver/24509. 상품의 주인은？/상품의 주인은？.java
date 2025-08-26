import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] ids = new int[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        int[] science = new int[n];
        
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
            science[i] = sc.nextInt();
        }
        
        boolean[] awarded = new boolean[n + 1];
        int[] winners = new int[4];
        
        winners[0] = getWinner(n, ids, korean, awarded);
        winners[1] = getWinner(n, ids, english, awarded);
        winners[2] = getWinner(n, ids, math, awarded);
        winners[3] = getWinner(n, ids, science, awarded);
        
        System.out.println(winners[0] + " " + winners[1] + " " + winners[2] + " " + winners[3]);
    }
    
    static int getWinner(int n, int[] ids, int[] scores, boolean[] awarded) {
        int winnerId = 0;
        int maxScore = -1;
        
        for (int i = 0; i < n; i++) {
            if (awarded[ids[i]]) continue;
            
            if (scores[i] > maxScore || (scores[i] == maxScore && ids[i] < winnerId)) {
                maxScore = scores[i];
                winnerId = ids[i];
            }
        }
        
        awarded[winnerId] = true;
        return winnerId;
    }
}