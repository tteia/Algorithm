import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    
	    int[] score = new int[n];
	    int[][] arr = new int[n][m];
	    
	    for(int i = 0; i < n; i++){
	        st = new StringTokenizer(br.readLine());
	        for(int j = 0; j < m; j++){
	         arr[i][j] = Integer.parseInt(st.nextToken());   
	        }
	    }

	    for(int i = 0; i < n; i++){
	        Arrays.sort(arr[i]);
	    }

		for(int i = 0; i < m; i++){
			int maxCard = -1;

			for(int j = 0; j < n; j++){
				if(arr[j][i] > maxCard){
                    maxCard = arr[j][i];
                }
			}

			for(int k = 0; k < n; k++){
				if(arr[k][i] == maxCard){
                    score[k]++;
				}
			}
		}

		int maxScore = score[0];
        for(int i = 1; i < n; i++){
            maxScore = Math.max(maxScore, score[i]);
        }

		for(int i = 0; i < n; i++){
			if(score[i] == maxScore){
				System.out.print((i+1) + " ");
			}
		}
	}
}