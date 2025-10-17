import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] team1 = new int[n];
        int[] team2 = new int[n];
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            team1[i] = Integer.parseInt(st1.nextToken());
            team2[i] = Integer.parseInt(st2.nextToken());
        }
        
        int maxStreak = 0;
        int currentStreak = 0;
        int currentWinner = 0;
        
        for (int i = 0; i < n; i++) {
            int p1 = team1[i];
            int p2 = team2[i];
            
            int result = getWinner(p1, p2);
            
            if (result == 1) {
                if (currentWinner == 1) {
                    currentStreak++;
                } else {
                    currentWinner = 1;
                    currentStreak = 1;
                }
            } else if (result == 2) {
                if (currentWinner == 2) {
                    currentStreak++;
                } else {
                    currentWinner = 2;
                    currentStreak = 1;
                }
            } else {
                currentWinner = (currentWinner == 1) ? 2 : 1;
                currentStreak = 1;
            }
            
            maxStreak = Math.max(maxStreak, currentStreak);
        }
        
        System.out.println(maxStreak);
    }
    
    static int getWinner(int p1, int p2) {
        if (p1 == p2) return 0;
        if ((p1 == 1 && p2 == 3) || (p1 == 2 && p2 == 1) || (p1 == 3 && p2 == 2)) {
            return 1;
        }
        return 2;
    }
}