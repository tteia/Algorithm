import java.io.*;
import java.util.*;
 
public class Main {
	public static int N, K;
	public static Queue<Integer> q = new LinkedList<>();
	public static StringBuilder sb = new StringBuilder();
	public static int answer = 0;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	
    	for(int i = 1; i <= N; i++) {
    		q.offer(i);
    	}
    	
    	sb.append("<");
    	
    	
    	while(q.size() != 1) {
    		for(int i = 0; i < K - 1; i++) {
    			q.offer(q.poll());
    		}
            
    		int kFind = q.poll();
    		sb.append(kFind+", ");
    	}
    	int kFind = q.poll();
    	sb.append(kFind+">");
    	System.out.println(sb.toString());
    }
    
    
    
}