import java.util.*;
import java.io.*;

class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder result = new StringBuilder();
	
	static int[] P;
	static int[] ans;
	static boolean[] visit;
	static int T;
	static int N;

	public static void main(String[] args) throws IOException{

		T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++){
			
			N = Integer.parseInt(br.readLine());	
			P = new int[N*2];
			ans = new int[N];
			visit = new boolean[N*2];
			
			String s = br. readLine();
			String[] array = s.split(" ");
			for(int j = 0; j < N*2; j++){
				P[j] = Integer.parseInt(array[j]);
			}
			

			int count = 0;
			for(int k = 0; k < N*2; k++){
				if(count == N) break;
				if(visit[k] || P[k]%3 != 0)
					continue;
					
				visit[k] = true;
				long price = (P[k] / 3) * 4;
				for(int j = k + 1; j < N*2; j++){
					if(!visit[j] && price == P[j]){	
						ans[count] = P[k];	
						visit[j] = true;    
						count++;
						break;		
					}
				}
			}

			result.append("Case #").append(i+1).append(": ");
			for(int j = 0; j < N; j++){
				result.append(ans[j]).append(' ');
			}
			result.append('\n');
		}
		
		br.close();
		
		bw.write(result.toString());
		bw.flush();
		bw.close();

	}
}