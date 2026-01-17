import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] xy = new int[101][101];
		int answer = 0;
		for (int i = 0; i < 4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int xx = x1; xx < x2; xx++) {
				for (int yy = y1; yy < y2; yy++ ) {
					xy[xx][yy] = 1;
				}
			}
		}
		
		
		for (int i = 0; i < 101; i++) {
			for(int u = 0; u < 101; u++) {
				if (xy[i][u] == 1) {
					answer ++;
				}
			}
		}
		
		System.out.println(answer);
	}
}