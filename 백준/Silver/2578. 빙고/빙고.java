import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] board = new int[5][5];

        for(int i = 0; i < 5; i++){
            int j = 0;
            StringTokenizer str = new StringTokenizer(br.readLine());
            while(str.hasMoreTokens()){
                board[i][j] = Integer.parseInt(str.nextToken());
                j++;
            }
        }

        int[][] called = new int[5][5];

        for(int i = 0; i < 5; i++){
            int j = 0;
            StringTokenizer str = new StringTokenizer(br.readLine());
            while(str.hasMoreTokens()){
                called[i][j] = Integer.parseInt(str.nextToken());
                j++;
            }
        }

        int cnt = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int num = called[i][j];

                for(int x = 0; x < 5; x++){
                    for(int y = 0; y < 5; y++){
                        if(board[x][y] == num) board[x][y] = 0;
                    }
                }
                cnt++;
                int bingo = checkBingo(board);

                if(bingo >= 3){
                    System.out.println(cnt);
                    return;
                }
            }
        }
    }

    public static int checkBingo(int[][] board){
        int cnt = 0;

        for(int i = 0; i < 5; i++){
            boolean width = true;
            for(int j = 0; j < 5; j++){
                if(board[i][j] != 0) width = false;
            }
            if(width) cnt++;
        }

        for(int i = 0; i < 5; i++){
            boolean height = true;
            for(int j = 0; j < 5; j++){
                if(board[j][i] != 0) height = false;
            }
            if(height) cnt++;
        }

        boolean diagonal = true;
        for(int i = 0; i < 5; i++){
            if(board[i][i] != 0) diagonal = false;
        }
        if(diagonal) cnt++;

        diagonal = true;
        for(int i = 0; i < 5; i++){
            if(board[i][4 - i] != 0) diagonal = false;
        }
        if(diagonal) cnt++;

        return cnt;

    }
}
