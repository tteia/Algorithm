import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer;
        int[][] arr = new int[m+1][n+1];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], 0);
        }
        arr[1][1] = 1;
        for (int[] puddle : puddles) {
            arr[puddle[0]][puddle[1]] = -1;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(i == j && i == 1){
                    continue;
                }
                if(arr[i][j] < 0){
                    continue;
                }
                if(arr[i-1][j] < 0){
                    arr[i-1][j] = 0;
                }
                else if(arr[i][j-1] < 0){
                    arr[i][j-1] = 0;
                }
                arr[i][j] = (arr[i-1][j] + arr[i][j-1]) % 1000000007;
            }
        }
        answer = arr[m][n] % 1000000007;
        return answer;
    }
}