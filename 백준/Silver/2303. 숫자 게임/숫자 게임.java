import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int now = 0;
		int[] maxOfOnes = new int[N];
		
		StringTokenizer st;
		int[] card = new int[5];
		for(int t = 0; t < N; t++) {
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 5; i++) {
				card[i] = Integer.parseInt(st.nextToken());
			}
            
			for(int i = 0; i < 5; i++) {
				for(int j = i + 1; j < 5; j++) {
					for(int k = j + 1; k < 5; k++) {
						now = (card[i]+card[j]+card[k]) % 10;
						if(now > maxOfOnes[t]) {
							maxOfOnes[t] = now;
						}
						
					}
				}
			}
		}

		int ans = 0;
		int ans_person = 0;
		
		for(int i = 0; i < N; i++) {
			if(maxOfOnes[i] >= ans) {
				ans = maxOfOnes[i];
				ans_person = i+1;
			}
		}
		
		System.out.println(ans_person);
		
	}
}