import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			String st = sc.next();
			
			switch(st) {
			case "push_front":
				int fnum = sc.nextInt();
				deque.offerFirst(fnum);
				break;
				
			case "push_back":
				int bnum = sc.nextInt();
				deque.offerLast(bnum);
				break;
				
			case "pop_front":
				if(!deque.isEmpty()) {
					int pollf = deque.pollFirst();
					System.out.println(pollf);
				}else {
					System.out.println(-1);
				}
				break;
				
			case "pop_back":
				if(!deque.isEmpty()) {
					int polll = deque.pollLast();
					System.out.println(polll);
				}else {
					System.out.println(-1);
				}
				break;
				
			case "size":
				System.out.println(deque.size());
				break;
				
			case "empty":
				if(deque.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
				
			case "front":
				if(!deque.isEmpty()) {
					int peekf = deque.peekFirst();
					System.out.println(peekf);
				}else {
					System.out.println(-1);
				}
				break;
				
			case "back":
				if(!deque.isEmpty()) {
					int peekl = deque.peekLast();
					System.out.println(peekl);
				}else {
					System.out.println(-1);
				}
				break;
			
			}
		}
		sc.close();
	}
}